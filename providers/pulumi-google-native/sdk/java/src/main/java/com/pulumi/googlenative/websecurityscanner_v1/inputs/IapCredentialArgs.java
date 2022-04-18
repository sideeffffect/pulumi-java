// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.websecurityscanner_v1.inputs.IapTestServiceAccountInfoArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes authentication configuration for Identity-Aware-Proxy (IAP).
 * 
 */
public final class IapCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final IapCredentialArgs Empty = new IapCredentialArgs();

    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
     */
    @Import(name="iapTestServiceAccountInfo")
      private final @Nullable Output<IapTestServiceAccountInfoArgs> iapTestServiceAccountInfo;

    public Output<IapTestServiceAccountInfoArgs> iapTestServiceAccountInfo() {
        return this.iapTestServiceAccountInfo == null ? Codegen.empty() : this.iapTestServiceAccountInfo;
    }

    public IapCredentialArgs(@Nullable Output<IapTestServiceAccountInfoArgs> iapTestServiceAccountInfo) {
        this.iapTestServiceAccountInfo = iapTestServiceAccountInfo;
    }

    private IapCredentialArgs() {
        this.iapTestServiceAccountInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IapTestServiceAccountInfoArgs> iapTestServiceAccountInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(IapCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iapTestServiceAccountInfo = defaults.iapTestServiceAccountInfo;
        }

        public Builder iapTestServiceAccountInfo(@Nullable Output<IapTestServiceAccountInfoArgs> iapTestServiceAccountInfo) {
            this.iapTestServiceAccountInfo = iapTestServiceAccountInfo;
            return this;
        }
        public Builder iapTestServiceAccountInfo(@Nullable IapTestServiceAccountInfoArgs iapTestServiceAccountInfo) {
            this.iapTestServiceAccountInfo = Codegen.ofNullable(iapTestServiceAccountInfo);
            return this;
        }        public IapCredentialArgs build() {
            return new IapCredentialArgs(iapTestServiceAccountInfo);
        }
    }
}
