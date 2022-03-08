// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceUrlEndpointInput {
    private final @Nullable String healthUrl;
    private final String url;

    @OutputCustomType.Constructor({"healthUrl","url"})
    private ServiceUrlEndpointInput(
        @Nullable String healthUrl,
        String url) {
        this.healthUrl = healthUrl;
        this.url = url;
    }

    public Optional<String> getHealthUrl() {
        return Optional.ofNullable(this.healthUrl);
    }
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUrlEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String healthUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUrlEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthUrl = defaults.healthUrl;
    	      this.url = defaults.url;
        }

        public Builder setHealthUrl(@Nullable String healthUrl) {
            this.healthUrl = healthUrl;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public ServiceUrlEndpointInput build() {
            return new ServiceUrlEndpointInput(healthUrl, url);
        }
    }
}
