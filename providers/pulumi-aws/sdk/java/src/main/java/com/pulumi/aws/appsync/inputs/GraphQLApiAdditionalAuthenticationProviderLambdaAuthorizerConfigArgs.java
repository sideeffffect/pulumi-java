// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs Empty = new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs();

    /**
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     * 
     */
    @Import(name="authorizerResultTtlInSeconds")
    private @Nullable Output<Integer> authorizerResultTtlInSeconds;

    public Optional<Output<Integer>> authorizerResultTtlInSeconds() {
        return Optional.ofNullable(this.authorizerResultTtlInSeconds);
    }

    /**
     * The ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     * 
     */
    @Import(name="authorizerUri", required=true)
    private Output<String> authorizerUri;

    public Output<String> authorizerUri() {
        return this.authorizerUri;
    }

    /**
     * A regular expression for validation of tokens before the Lambda function is called.
     * 
     */
    @Import(name="identityValidationExpression")
    private @Nullable Output<String> identityValidationExpression;

    public Optional<Output<String>> identityValidationExpression() {
        return Optional.ofNullable(this.identityValidationExpression);
    }

    private GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs() {}

    private GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs $) {
        this.authorizerResultTtlInSeconds = $.authorizerResultTtlInSeconds;
        this.authorizerUri = $.authorizerUri;
        this.identityValidationExpression = $.identityValidationExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs $;

        public Builder() {
            $ = new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs();
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs defaults) {
            $ = new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizerResultTtlInSeconds(@Nullable Output<Integer> authorizerResultTtlInSeconds) {
            $.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }

        public Builder authorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
            return authorizerResultTtlInSeconds(Output.of(authorizerResultTtlInSeconds));
        }

        public Builder authorizerUri(Output<String> authorizerUri) {
            $.authorizerUri = authorizerUri;
            return this;
        }

        public Builder authorizerUri(String authorizerUri) {
            return authorizerUri(Output.of(authorizerUri));
        }

        public Builder identityValidationExpression(@Nullable Output<String> identityValidationExpression) {
            $.identityValidationExpression = identityValidationExpression;
            return this;
        }

        public Builder identityValidationExpression(String identityValidationExpression) {
            return identityValidationExpression(Output.of(identityValidationExpression));
        }

        public GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs build() {
            $.authorizerUri = Objects.requireNonNull($.authorizerUri, "expected parameter 'authorizerUri' to be non-null");
            return $;
        }
    }

}
