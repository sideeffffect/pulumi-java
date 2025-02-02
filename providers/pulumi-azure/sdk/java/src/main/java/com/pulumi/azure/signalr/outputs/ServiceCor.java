// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceCor {
    /**
     * @return A list of origins which should be able to make cross-origin calls. `*` can be used to allow all calls.
     * 
     */
    private final List<String> allowedOrigins;

    @CustomType.Constructor
    private ServiceCor(@CustomType.Parameter("allowedOrigins") List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    /**
     * @return A list of origins which should be able to make cross-origin calls. `*` can be used to allow all calls.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }        public ServiceCor build() {
            return new ServiceCor(allowedOrigins);
        }
    }
}
