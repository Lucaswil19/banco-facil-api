package com.unifebe.devsecops.config;

/**
 * ATENCAO - CODIGO PROPOSITALMENTE INSEGURO PARA FINS DIDATICOS.
 * Nunca faca isto em um projeto real: credenciais NUNCA devem ser
 * gravadas diretamente no codigo-fonte (Secret Sprawl).
 */
public final class AppConfig {

    private AppConfig() {
        // Classe utilitaria; nao deve ser instanciada.
    }

    /**
     * Em producao, estas variaveis devem ser fornecidas por um cofre de
     * segredos, como Vault ou AWS Secrets Manager, e nao pelo GITHUB_TOKEN.
     */
    public static String dbPassword() {
        return System.getenv("DB_PASSWORD");
    }

    public static String awsAccessKeyId() {
        return System.getenv("AWS_ACCESS_KEY_ID");
    }

    public static String awsSecretAccessKey() {
        return System.getenv("AWS_SECRET_ACCESS_KEY");
    }

    public static String paymentGatewayApiKey() {
        return System.getenv("PAYMENT_GATEWAY_API_KEY");
    }

}
