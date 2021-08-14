package leetcode;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Simple URI Parser
//이 문제에서 간소화한 URI(Uniform Resource Identifier)의 형식은 아래와 같습니다.
//
// scheme:[//host][/path][?query]
//요구사항
//String을 입력받아 Uri를 반환하는 parse() 함수를 구현해주세요.
//
//입력 설명
//각 Input은 위에서 설명한 URI 형식을 따르고, 각 구성 요소별 스펙은 아래 내용을 참고해주세요.
//
//scheme 는 영문자로만 구성됩니다.
//host 는 영문자, 숫자 , -, . 로 구성됩니다.
//path 는 영문자, 숫자, -, _, ., / 로 구성됩니다.
//query는 key=value 형태로 쌍을 이루고, key와 value는 영문자, 숫자, -, _, .로 구성됩니다. 중복된 key는 존재하지 않고, query는 key로 정렬되어 있습니다. 여러 개의 key=value 지정이 가능하며, 각각의 항목들은 & 문자로 구분됩니다.
//scheme과 host는 필수값이지만 path와 query는 생략할 수 있습니다.
//영문 대소문자는 구분하지 않습니다.
public class toss2 {
    public static void main(String[] args) throws IOException {
        //만 19세 이상부터 카드발급가능 즉. yyyyMMdd가 들어옴.
        System.out.println("ss");
    }


    class Solution {
        // 이 함수는 수정하지 마세요.
        public String[] solution(String[] data) {
            return Arrays.stream(data).map(input -> {
                return parse(input).toString();
            }).toArray(String[]::new);
        }

        // 이 함수를 구현해주세요.
        public Uri parse(String input) {

        }

        // 이 클래스는 수정하지 않아도 됩니다.
        static class Uri {
            private String scheme;
            private String host;
            private String path;
            private Map<String, String> query;

            public Uri(String scheme, String host, String path, Map<String, String> query) {
                this.scheme = scheme;
                this.host = host;
                this.path = path;
                this.query = query;
            }

            public String getScheme() {
                return scheme;
            }

            public void setScheme(String scheme) {
                this.scheme = scheme;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public Map<String, String> getQuery() {
                return query;
            }

            public void setQuery(Map<String, String> query) {
                this.query = query;
            }

            @Override
            public String toString() {
                StringBuilder queryBuilder = new StringBuilder();
                queryBuilder.append("{");
                if (query != null) {
                    String pair = query.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey())
                            .map(entry -> String.format("%s=%s", entry.getKey(), entry.getValue()))
                            .collect(Collectors.joining(", "));
                    queryBuilder.append(pair);
                }
                queryBuilder.append("}");
                return String.format(
                        "Uri(scheme=%s, host=%s, path=%s, query=%s)",
                        scheme != null ? scheme : "",
                        host != null ? host : "",
                        path != null ? path : "",
                        queryBuilder.toString());
            }
        }
    }
}
