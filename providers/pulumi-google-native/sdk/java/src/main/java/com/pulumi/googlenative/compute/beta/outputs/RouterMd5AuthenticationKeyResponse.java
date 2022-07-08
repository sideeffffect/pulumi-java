// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterMd5AuthenticationKeyResponse {
    /**
     * @return [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    private final String key;
    /**
     * @return Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private RouterMd5AuthenticationKeyResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("name") String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * @return [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value from the previous configuration. This is allowed if the key with the same name existed before the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Name used to identify the key. Must be unique within a router. Must be referenced by at least one bgpPeer. Must comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterMd5AuthenticationKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterMd5AuthenticationKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public RouterMd5AuthenticationKeyResponse build() {
            return new RouterMd5AuthenticationKeyResponse(key, name);
        }
    }
}
