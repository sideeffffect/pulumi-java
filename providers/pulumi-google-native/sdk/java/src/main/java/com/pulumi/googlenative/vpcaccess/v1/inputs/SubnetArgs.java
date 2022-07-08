// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vpcaccess.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The subnet in which to house the connector
 * 
 */
public final class SubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private SubnetArgs() {}

    private SubnetArgs(SubnetArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetArgs $;

        public Builder() {
            $ = new SubnetArgs();
        }

        public Builder(SubnetArgs defaults) {
            $ = new SubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public SubnetArgs build() {
            return $;
        }
    }

}
