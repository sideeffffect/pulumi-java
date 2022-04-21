// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskResourcePolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskResourcePolicyAttachmentArgs Empty = new DiskResourcePolicyAttachmentArgs();

    /**
     * The name of the disk in which the resource policies are attached to.
     * 
     */
    @Import(name="disk", required=true)
    private Output<String> disk;

    public Output<String> disk() {
        return this.disk;
    }

    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A reference to the zone where the disk resides.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private DiskResourcePolicyAttachmentArgs() {}

    private DiskResourcePolicyAttachmentArgs(DiskResourcePolicyAttachmentArgs $) {
        this.disk = $.disk;
        this.name = $.name;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskResourcePolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskResourcePolicyAttachmentArgs $;

        public Builder() {
            $ = new DiskResourcePolicyAttachmentArgs();
        }

        public Builder(DiskResourcePolicyAttachmentArgs defaults) {
            $ = new DiskResourcePolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder disk(Output<String> disk) {
            $.disk = disk;
            return this;
        }

        public Builder disk(String disk) {
            return disk(Output.of(disk));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public DiskResourcePolicyAttachmentArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            return $;
        }
    }

}
