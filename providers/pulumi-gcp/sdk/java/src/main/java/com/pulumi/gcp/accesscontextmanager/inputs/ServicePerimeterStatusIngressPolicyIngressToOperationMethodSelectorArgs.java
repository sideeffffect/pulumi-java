// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs Empty = new ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs();

    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
     */
    @Import(name="permission")
    private @Nullable Output<String> permission;

    public Optional<Output<String>> permission() {
        return Optional.ofNullable(this.permission);
    }

    private ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs() {}

    private ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs $) {
        this.method = $.method;
        this.permission = $.permission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs $;

        public Builder() {
            $ = new ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs();
        }

        public Builder(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs defaults) {
            $ = new ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        public Builder method(String method) {
            return method(Output.of(method));
        }

        public Builder permission(@Nullable Output<String> permission) {
            $.permission = permission;
            return this;
        }

        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs build() {
            return $;
        }
    }

}
