// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.aws.cognito.outputs.UserPoolLambdaConfigCustomEmailSender;
import io.pulumi.aws.cognito.outputs.UserPoolLambdaConfigCustomSmsSender;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolLambdaConfig {
    /**
     * ARN of the lambda creating an authentication challenge.
     * 
     */
    private final @Nullable String createAuthChallenge;
    /**
     * A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
     */
    private final @Nullable UserPoolLambdaConfigCustomEmailSender customEmailSender;
    /**
     * Custom Message AWS Lambda trigger.
     * 
     */
    private final @Nullable String customMessage;
    /**
     * A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
     */
    private final @Nullable UserPoolLambdaConfigCustomSmsSender customSmsSender;
    /**
     * Defines the authentication challenge.
     * 
     */
    private final @Nullable String defineAuthChallenge;
    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Post-authentication AWS Lambda trigger.
     * 
     */
    private final @Nullable String postAuthentication;
    /**
     * Post-confirmation AWS Lambda trigger.
     * 
     */
    private final @Nullable String postConfirmation;
    /**
     * Pre-authentication AWS Lambda trigger.
     * 
     */
    private final @Nullable String preAuthentication;
    /**
     * Pre-registration AWS Lambda trigger.
     * 
     */
    private final @Nullable String preSignUp;
    /**
     * Allow to customize identity token claims before token generation.
     * 
     */
    private final @Nullable String preTokenGeneration;
    /**
     * User migration Lambda config type.
     * 
     */
    private final @Nullable String userMigration;
    /**
     * Verifies the authentication challenge response.
     * 
     */
    private final @Nullable String verifyAuthChallengeResponse;

    @CustomType.Constructor
    private UserPoolLambdaConfig(
        @CustomType.Parameter("createAuthChallenge") @Nullable String createAuthChallenge,
        @CustomType.Parameter("customEmailSender") @Nullable UserPoolLambdaConfigCustomEmailSender customEmailSender,
        @CustomType.Parameter("customMessage") @Nullable String customMessage,
        @CustomType.Parameter("customSmsSender") @Nullable UserPoolLambdaConfigCustomSmsSender customSmsSender,
        @CustomType.Parameter("defineAuthChallenge") @Nullable String defineAuthChallenge,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("postAuthentication") @Nullable String postAuthentication,
        @CustomType.Parameter("postConfirmation") @Nullable String postConfirmation,
        @CustomType.Parameter("preAuthentication") @Nullable String preAuthentication,
        @CustomType.Parameter("preSignUp") @Nullable String preSignUp,
        @CustomType.Parameter("preTokenGeneration") @Nullable String preTokenGeneration,
        @CustomType.Parameter("userMigration") @Nullable String userMigration,
        @CustomType.Parameter("verifyAuthChallengeResponse") @Nullable String verifyAuthChallengeResponse) {
        this.createAuthChallenge = createAuthChallenge;
        this.customEmailSender = customEmailSender;
        this.customMessage = customMessage;
        this.customSmsSender = customSmsSender;
        this.defineAuthChallenge = defineAuthChallenge;
        this.kmsKeyId = kmsKeyId;
        this.postAuthentication = postAuthentication;
        this.postConfirmation = postConfirmation;
        this.preAuthentication = preAuthentication;
        this.preSignUp = preSignUp;
        this.preTokenGeneration = preTokenGeneration;
        this.userMigration = userMigration;
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    /**
     * ARN of the lambda creating an authentication challenge.
     * 
    */
    public Optional<String> createAuthChallenge() {
        return Optional.ofNullable(this.createAuthChallenge);
    }
    /**
     * A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
    */
    public Optional<UserPoolLambdaConfigCustomEmailSender> customEmailSender() {
        return Optional.ofNullable(this.customEmailSender);
    }
    /**
     * Custom Message AWS Lambda trigger.
     * 
    */
    public Optional<String> customMessage() {
        return Optional.ofNullable(this.customMessage);
    }
    /**
     * A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
    */
    public Optional<UserPoolLambdaConfigCustomSmsSender> customSmsSender() {
        return Optional.ofNullable(this.customSmsSender);
    }
    /**
     * Defines the authentication challenge.
     * 
    */
    public Optional<String> defineAuthChallenge() {
        return Optional.ofNullable(this.defineAuthChallenge);
    }
    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
    */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Post-authentication AWS Lambda trigger.
     * 
    */
    public Optional<String> postAuthentication() {
        return Optional.ofNullable(this.postAuthentication);
    }
    /**
     * Post-confirmation AWS Lambda trigger.
     * 
    */
    public Optional<String> postConfirmation() {
        return Optional.ofNullable(this.postConfirmation);
    }
    /**
     * Pre-authentication AWS Lambda trigger.
     * 
    */
    public Optional<String> preAuthentication() {
        return Optional.ofNullable(this.preAuthentication);
    }
    /**
     * Pre-registration AWS Lambda trigger.
     * 
    */
    public Optional<String> preSignUp() {
        return Optional.ofNullable(this.preSignUp);
    }
    /**
     * Allow to customize identity token claims before token generation.
     * 
    */
    public Optional<String> preTokenGeneration() {
        return Optional.ofNullable(this.preTokenGeneration);
    }
    /**
     * User migration Lambda config type.
     * 
    */
    public Optional<String> userMigration() {
        return Optional.ofNullable(this.userMigration);
    }
    /**
     * Verifies the authentication challenge response.
     * 
    */
    public Optional<String> verifyAuthChallengeResponse() {
        return Optional.ofNullable(this.verifyAuthChallengeResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createAuthChallenge;
        private @Nullable UserPoolLambdaConfigCustomEmailSender customEmailSender;
        private @Nullable String customMessage;
        private @Nullable UserPoolLambdaConfigCustomSmsSender customSmsSender;
        private @Nullable String defineAuthChallenge;
        private @Nullable String kmsKeyId;
        private @Nullable String postAuthentication;
        private @Nullable String postConfirmation;
        private @Nullable String preAuthentication;
        private @Nullable String preSignUp;
        private @Nullable String preTokenGeneration;
        private @Nullable String userMigration;
        private @Nullable String verifyAuthChallengeResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createAuthChallenge = defaults.createAuthChallenge;
    	      this.customEmailSender = defaults.customEmailSender;
    	      this.customMessage = defaults.customMessage;
    	      this.customSmsSender = defaults.customSmsSender;
    	      this.defineAuthChallenge = defaults.defineAuthChallenge;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.postAuthentication = defaults.postAuthentication;
    	      this.postConfirmation = defaults.postConfirmation;
    	      this.preAuthentication = defaults.preAuthentication;
    	      this.preSignUp = defaults.preSignUp;
    	      this.preTokenGeneration = defaults.preTokenGeneration;
    	      this.userMigration = defaults.userMigration;
    	      this.verifyAuthChallengeResponse = defaults.verifyAuthChallengeResponse;
        }

        public Builder createAuthChallenge(@Nullable String createAuthChallenge) {
            this.createAuthChallenge = createAuthChallenge;
            return this;
        }
        public Builder customEmailSender(@Nullable UserPoolLambdaConfigCustomEmailSender customEmailSender) {
            this.customEmailSender = customEmailSender;
            return this;
        }
        public Builder customMessage(@Nullable String customMessage) {
            this.customMessage = customMessage;
            return this;
        }
        public Builder customSmsSender(@Nullable UserPoolLambdaConfigCustomSmsSender customSmsSender) {
            this.customSmsSender = customSmsSender;
            return this;
        }
        public Builder defineAuthChallenge(@Nullable String defineAuthChallenge) {
            this.defineAuthChallenge = defineAuthChallenge;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder postAuthentication(@Nullable String postAuthentication) {
            this.postAuthentication = postAuthentication;
            return this;
        }
        public Builder postConfirmation(@Nullable String postConfirmation) {
            this.postConfirmation = postConfirmation;
            return this;
        }
        public Builder preAuthentication(@Nullable String preAuthentication) {
            this.preAuthentication = preAuthentication;
            return this;
        }
        public Builder preSignUp(@Nullable String preSignUp) {
            this.preSignUp = preSignUp;
            return this;
        }
        public Builder preTokenGeneration(@Nullable String preTokenGeneration) {
            this.preTokenGeneration = preTokenGeneration;
            return this;
        }
        public Builder userMigration(@Nullable String userMigration) {
            this.userMigration = userMigration;
            return this;
        }
        public Builder verifyAuthChallengeResponse(@Nullable String verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }        public UserPoolLambdaConfig build() {
            return new UserPoolLambdaConfig(createAuthChallenge, customEmailSender, customMessage, customSmsSender, defineAuthChallenge, kmsKeyId, postAuthentication, postConfirmation, preAuthentication, preSignUp, preTokenGeneration, userMigration, verifyAuthChallengeResponse);
        }
    }
}
