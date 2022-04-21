// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SharedVPCHostProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedVPCHostProjectArgs Empty = new SharedVPCHostProjectArgs();

    /**
     * The ID of the project that will serve as a Shared VPC host project
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    private SharedVPCHostProjectArgs() {}

    private SharedVPCHostProjectArgs(SharedVPCHostProjectArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedVPCHostProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedVPCHostProjectArgs $;

        public Builder() {
            $ = new SharedVPCHostProjectArgs();
        }

        public Builder(SharedVPCHostProjectArgs defaults) {
            $ = new SharedVPCHostProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public SharedVPCHostProjectArgs build() {
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
