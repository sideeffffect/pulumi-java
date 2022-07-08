// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AddressableResponse {
    private final String url;

    @CustomType.Constructor
    private AddressableResponse(@CustomType.Parameter("url") String url) {
        this.url = url;
    }

    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public AddressableResponse build() {
            return new AddressableResponse(url);
        }
    }
}
