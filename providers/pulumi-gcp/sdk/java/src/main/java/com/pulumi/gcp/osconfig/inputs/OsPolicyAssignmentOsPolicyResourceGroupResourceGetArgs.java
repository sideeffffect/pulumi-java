// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs();

    /**
     * Exec resource
     * 
     */
    @Import(name="exec")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * A remote or local source.
     * 
     */
    @Import(name="file")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Package resource
     * 
     */
    @Import(name="pkg")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs>> pkg() {
        return Optional.ofNullable(this.pkg);
    }

    /**
     * Package repository resource
     * 
     */
    @Import(name="repository")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs $) {
        this.exec = $.exec;
        this.file = $.file;
        this.id = $.id;
        this.pkg = $.pkg;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder exec(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec) {
            $.exec = exec;
            return this;
        }

        public Builder exec(OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs exec) {
            return exec(Output.of(exec));
        }

        public Builder file(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs file) {
            return file(Output.of(file));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder pkg(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg) {
            $.pkg = pkg;
            return this;
        }

        public Builder pkg(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs pkg) {
            return pkg(Output.of(pkg));
        }

        public Builder repository(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs repository) {
            return repository(Output.of(repository));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
