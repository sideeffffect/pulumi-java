// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Private Connectivity
 * 
 */
public final class PrivateConnectivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateConnectivityResponse Empty = new PrivateConnectivityResponse();

    @Import(name="privateConnectionName", required=true)
      private final String privateConnectionName;

    public String privateConnectionName() {
        return this.privateConnectionName;
    }

    public PrivateConnectivityResponse(String privateConnectionName) {
        this.privateConnectionName = Objects.requireNonNull(privateConnectionName, "expected parameter 'privateConnectionName' to be non-null");
    }

    private PrivateConnectivityResponse() {
        this.privateConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateConnectionName = defaults.privateConnectionName;
        }

        public Builder privateConnectionName(String privateConnectionName) {
            this.privateConnectionName = Objects.requireNonNull(privateConnectionName);
            return this;
        }        public PrivateConnectivityResponse build() {
            return new PrivateConnectivityResponse(privateConnectionName);
        }
    }
}
