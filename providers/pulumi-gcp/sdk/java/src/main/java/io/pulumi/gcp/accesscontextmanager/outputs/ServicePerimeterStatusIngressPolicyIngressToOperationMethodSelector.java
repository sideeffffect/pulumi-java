// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector {
    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
     */
    private final @Nullable String method;
    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
     */
    private final @Nullable String permission;

    @CustomType.Constructor
    private ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector(
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("permission") @Nullable String permission) {
        this.method = method;
        this.permission = permission;
    }

    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
    */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
    */
    public Optional<String> permission() {
        return Optional.ofNullable(this.permission);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder permission(@Nullable String permission) {
            this.permission = permission;
            return this;
        }        public ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector build() {
            return new ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector(method, permission);
        }
    }
}
