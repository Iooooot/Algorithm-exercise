package leetcode;

import java.util.HashMap;

/**
 * @author wht
 * @date 2023/2/10 11:12
 */
public class 设计一个验证系统 {
    public static void main(String[] args) {
        class AuthenticationManager {
            private final HashMap<String, Integer> map = new HashMap<>();
            public int timeToLive;

            public AuthenticationManager(int timeToLive) {
                this.timeToLive = timeToLive;
            }

            public void generate(String tokenId, int currentTime) {
                int t = currentTime + timeToLive;
                map.put(tokenId,t);
            }

            public void renew(String tokenId, int currentTime) {
                if (map.getOrDefault(tokenId, 0) <= currentTime) {
                    return;
                }
                generate(tokenId, currentTime);
            }

            public int countUnexpiredTokens(int currentTime) {
                int ans = 0;
                for (int exp : map.values()) {
                    if (exp > currentTime) {
                        ++ans;
                    }
                }
                return ans;
            }
        }
    }
}
