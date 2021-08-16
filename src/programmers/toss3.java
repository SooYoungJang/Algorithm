//package leetcode;
//
//import java.io.IOException;
//
////문제 설명
////긴급 코드 복구
////작성된 코드의 일부가 알 수 없는 이유로 유실되었습니다.
////주석과 남겨진 코드 조각들 참고하여 코드들을 복구하고, 컴파일 및 정상 실행이 가능하도록 수정해주세요.
////
////요구사항
////Solution class 아래에 있는 나머지 코드들을 주석에 맞추어 적절하게 완성시켜 테스트 케이스를 통과해야합니다.
////
////Solution class 는 수정하지 않습니다.
////유실된 코드 조각은 TODO 유실됨 주석이 있는 부분입니다.
////나머지 코드는 수정하거나 추가할 필요가 없습니다.
////입력 조건
////-1000 <= N <= 1000
////-1000 <= M <= 1000
////입출력 예시 1
//// 입력 : N=1, M=1
//// 출력 : 198  // (4 + 40) + (6 + 60) + (8 + 80)
////입출력 예시 2
//// 입력 : N=-1, M=1
//// 출력 : 132  // (2 + 20) + (4 + 40) + (6 + 60)
//public class toss3 {
//    public static void main(String[] args) throws IOException {
//
//    }
//
//
//    class Solution {
//        public long solution(int N, long M) {
//            long answer = 0L;
//
//            Foo foo = new PlusOne();
//            TenMultiplier tenMultiplier = new TenMultiplier(foo);
//            answer += new Sum(N, M, foo).calculate();
//            answer += new Sum(N, M, tenMultiplier).calculate();
//
//            foo = new PlusTwo();
//            tenMultiplier = new TenMultiplier(foo);
//            answer += new Sum(N, M, foo).calculate();
//            answer += new Sum(N, M, tenMultiplier).calculate();
//
//            foo = new PlusThree();
//            tenMultiplier = new TenMultiplier(foo);
//            answer += new Sum(N, M, foo).calculate();
//            answer += new Sum(N, M, tenMultiplier).calculate();
//
//            return answer;
//        }
//    }
//
//    interface Foo {
//        int foo(int i);
//        long foo(long l);
//    }
//
//
//    /**
//     * Foo 의 구현체
//     * 인자로 넘어온 값에 +1
//     *
//     * TODO 유실됨
//     */
//    class PlusOne
//
//
//    /**
//     * Foo 의 구현체
//     * 인자로 넘어온 값에 +2
//     *
//     * TODO 유실됨
//     */
//    class PlusTwo
//
//    /**
//     * Foo 의 구현체
//     * 인자로 넘어온 값에 +3
//     *
//     * TODO 유실됨
//     */
//    class PlusThree
//
//
//
//    /**
//     * Foo 의 구현체
//     * 넘어온 Foo 의 foo 함수 호출 결과를 * 10 을 한다
//     *
//     * TODO 유실됨
//     */
//    class TenMultiplier {
//        private final Foo foo;
//        TenMultiplier(Foo foo) {
//            this.foo = foo;
//        }
//    }
//
//
//    /**
//     * 각각의 인자들을 받아서 Foo 인터페이스의 내부 함수들의 반환 값들을 덧셈하기 위한 class
//     */
//    class Sum {
//        private final int i;
//        private final long l;
//        private final Foo foo;
//        /**
//         *
//         * @param i  Foo 의 foo(int i) 에 인자
//         * @param l Foo 의 foo(long l) 에 인자
//         * @param foo Foo
//         */
//        Sum(int i, long l, Foo foo) {
//            this.i = i;
//            this.l = l;
//            this.foo = foo;
//        }
//        long calculate() {
//            return foo.foo(i) + foo.foo(l);
//        }
//    }
//}
//
//// Solution class 는 수정하면 안됩니다.
