// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs();

    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<String> method;

    public Output<String> method() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
     */
    @Import(name="permission")
      private final @Nullable Output<String> permission;

    public Output<String> permission() {
        return this.permission == null ? Codegen.empty() : this.permission;
    }

    public ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs(
        @Nullable Output<String> method,
        @Nullable Output<String> permission) {
        this.method = method;
        this.permission = permission;
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs() {
        this.method = Codegen.empty();
        this.permission = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> method;
        private @Nullable Output<String> permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder method(@Nullable Output<String> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder permission(@Nullable Output<String> permission) {
            this.permission = permission;
            return this;
        }
        public Builder permission(@Nullable String permission) {
            this.permission = Codegen.ofNullable(permission);
            return this;
        }        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorGetArgs(method, permission);
        }
    }
}
