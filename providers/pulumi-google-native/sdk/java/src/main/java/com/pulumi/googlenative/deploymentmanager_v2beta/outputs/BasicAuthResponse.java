// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BasicAuthResponse {
    private final String password;
    private final String user;

    @CustomType.Constructor
    private BasicAuthResponse(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("user") String user) {
        this.password = password;
        this.user = user;
    }

    public String password() {
        return this.password;
    }
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String user;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.user = defaults.user;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }        public BasicAuthResponse build() {
            return new BasicAuthResponse(password, user);
        }
    }
}
