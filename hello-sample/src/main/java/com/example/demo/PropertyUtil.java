package com.example.demo;

public class PropertyUtil {

//    private static final String INIT_FILE_PATH = "/././application.properties";
//    private static final Properties properties;
//
//    private PropertyUtil() throws Exception {
//    }
//
//    static {
//        properties = new Properties();
//        try {
//            properties.load(Files.newBufferedReader(Paths.get(INIT_FILE_PATH), StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            // ファイル読み込みに失敗
//            System.out.println(String.format("ファイルの読み込みに失敗しました。ファイル名:%s", INIT_FILE_PATH));
//        }
//    }
//
//    /**
//     * プロパティ値を取得する
//     *
//     * @param key キー
//     * @return 値
//     */
//    public static String getProperty(final String key) {
//        return getProperty(key, "");
//    }
//
//    /**
//     * プロパティ値を取得する
//     *
//     * @param key キー
//     * @param defaultValue デフォルト値
//     * @return キーが存在しない場合、デフォルト値
//     *          存在する場合、値
//     */
//    public static String getProperty(final String key, final String defaultValue) {
//        return properties.getProperty(key, defaultValue);
//    }
}