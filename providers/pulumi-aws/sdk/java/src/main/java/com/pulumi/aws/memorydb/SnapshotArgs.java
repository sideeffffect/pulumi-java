// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * Name of the MemoryDB cluster to take a snapshot of.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * ARN of the KMS key used to encrypt the snapshot at rest.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * Name of the cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.clusterName = $.clusterName;
        this.kmsKeyArn = $.kmsKeyArn;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public SnapshotArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            return $;
        }
    }

}
