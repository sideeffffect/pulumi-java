// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RegistryCredential {
    private final Map<String,Object> publicKeyCertificate;

    @CustomType.Constructor
    private RegistryCredential(@CustomType.Parameter("publicKeyCertificate") Map<String,Object> publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    public Map<String,Object> publicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(Map<String,Object> publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }        public RegistryCredential build() {
            return new RegistryCredential(publicKeyCertificate);
        }
    }
}
