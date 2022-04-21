// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1beta.enums.ServicePerimeterPerimeterType;
import com.pulumi.googlenative.accesscontextmanager_v1beta.inputs.ServicePerimeterConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    @Import(name="accessPolicyId", required=true)
    private Output<String> accessPolicyId;

    public Output<String> accessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, restricted/unrestricted service lists as well as access lists must be empty.
     * 
     */
    @Import(name="perimeterType")
    private @Nullable Output<ServicePerimeterPerimeterType> perimeterType;

    public Optional<Output<ServicePerimeterPerimeterType>> perimeterType() {
        return Optional.ofNullable(this.perimeterType);
    }

    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted/unrestricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @Import(name="status")
    private @Nullable Output<ServicePerimeterConfigArgs> status;

    public Optional<Output<ServicePerimeterConfigArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private ServicePerimeterArgs() {}

    private ServicePerimeterArgs(ServicePerimeterArgs $) {
        this.accessPolicyId = $.accessPolicyId;
        this.description = $.description;
        this.name = $.name;
        this.perimeterType = $.perimeterType;
        this.status = $.status;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterArgs $;

        public Builder() {
            $ = new ServicePerimeterArgs();
        }

        public Builder(ServicePerimeterArgs defaults) {
            $ = new ServicePerimeterArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicyId(Output<String> accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            return accessPolicyId(Output.of(accessPolicyId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder perimeterType(@Nullable Output<ServicePerimeterPerimeterType> perimeterType) {
            $.perimeterType = perimeterType;
            return this;
        }

        public Builder perimeterType(ServicePerimeterPerimeterType perimeterType) {
            return perimeterType(Output.of(perimeterType));
        }

        public Builder status(@Nullable Output<ServicePerimeterConfigArgs> status) {
            $.status = status;
            return this;
        }

        public Builder status(ServicePerimeterConfigArgs status) {
            return status(Output.of(status));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ServicePerimeterArgs build() {
            $.accessPolicyId = Objects.requireNonNull($.accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
            return $;
        }
    }

}
