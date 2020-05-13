package org.jiajie.coffeecode.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 在解决器中找不到解答
 *
 * @author jay
 * @param <P>   位置类
 * @param <M>   移动类
 */
public class PuzzleSolver<P, M> extends ConcurrentPuzzleSolver<P, M> {
    public PuzzleSolver(Puzzle<P, M> puzzle) {
        super(puzzle);
    }

    private final AtomicInteger taskCount = new AtomicInteger(0);

    @Override
    protected Runnable newTask(P p, M m, Node<P, M> n) {
        return new CountingSolverTask(p, m, n);
    }

    class CountingSolverTask extends SolverTask {

        public CountingSolverTask(P pos, M move, Node<P, M> prev) {
            super(pos, move, prev);
        }

        @Override
        public void run() {
            try {
                super.run();
            } finally {
                if (taskCount.decrementAndGet() == 0) {
                    solution.setValue(null);
                }
            }
        }
    }
}
