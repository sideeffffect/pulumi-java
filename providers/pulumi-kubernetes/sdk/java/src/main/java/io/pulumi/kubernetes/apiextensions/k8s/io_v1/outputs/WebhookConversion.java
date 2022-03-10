// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.WebhookClientConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookConversion {
    /**
     * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
     * 
     */
    private final @Nullable WebhookClientConfig clientConfig;
    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
     * 
     */
    private final List<String> conversionReviewVersions;

    @OutputCustomType.Constructor
    private WebhookConversion(
        @OutputCustomType.Parameter("clientConfig") @Nullable WebhookClientConfig clientConfig,
        @OutputCustomType.Parameter("conversionReviewVersions") List<String> conversionReviewVersions) {
        this.clientConfig = clientConfig;
        this.conversionReviewVersions = conversionReviewVersions;
    }

    /**
     * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
     * 
    */
    public Optional<WebhookClientConfig> getClientConfig() {
        return Optional.ofNullable(this.clientConfig);
    }
    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
     * 
    */
    public List<String> getConversionReviewVersions() {
        return this.conversionReviewVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookConversion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebhookClientConfig clientConfig;
        private List<String> conversionReviewVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookConversion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfig = defaults.clientConfig;
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
        }

        public Builder clientConfig(@Nullable WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        public Builder conversionReviewVersions(List<String> conversionReviewVersions) {
            this.conversionReviewVersions = Objects.requireNonNull(conversionReviewVersions);
            return this;
        }
        public WebhookConversion build() {
            return new WebhookConversion(clientConfig, conversionReviewVersions);
        }
    }
}
