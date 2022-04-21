// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio;

import com.pulumi.awsnative.nimblestudio.inputs.StreamingImageTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingImageArgs Empty = new StreamingImageArgs();

    /**
     * &lt;p&gt;A human-readable description of the streaming image.&lt;/p&gt;
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * &lt;p&gt;The ID of an EC2 machine image with which to create this streaming image.&lt;/p&gt;
     * 
     */
    @Import(name="ec2ImageId", required=true)
    private Output<String> ec2ImageId;

    public Output<String> ec2ImageId() {
        return this.ec2ImageId;
    }

    /**
     * &lt;p&gt;A friendly name for a streaming image resource.&lt;/p&gt;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    @Import(name="studioId", required=true)
    private Output<String> studioId;

    public Output<String> studioId() {
        return this.studioId;
    }

    @Import(name="tags")
    private @Nullable Output<StreamingImageTagsArgs> tags;

    public Optional<Output<StreamingImageTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StreamingImageArgs() {}

    private StreamingImageArgs(StreamingImageArgs $) {
        this.description = $.description;
        this.ec2ImageId = $.ec2ImageId;
        this.name = $.name;
        this.studioId = $.studioId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingImageArgs $;

        public Builder() {
            $ = new StreamingImageArgs();
        }

        public Builder(StreamingImageArgs defaults) {
            $ = new StreamingImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder ec2ImageId(Output<String> ec2ImageId) {
            $.ec2ImageId = ec2ImageId;
            return this;
        }

        public Builder ec2ImageId(String ec2ImageId) {
            return ec2ImageId(Output.of(ec2ImageId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder studioId(Output<String> studioId) {
            $.studioId = studioId;
            return this;
        }

        public Builder studioId(String studioId) {
            return studioId(Output.of(studioId));
        }

        public Builder tags(@Nullable Output<StreamingImageTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(StreamingImageTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public StreamingImageArgs build() {
            $.ec2ImageId = Objects.requireNonNull($.ec2ImageId, "expected parameter 'ec2ImageId' to be non-null");
            $.studioId = Objects.requireNonNull($.studioId, "expected parameter 'studioId' to be non-null");
            return $;
        }
    }

}
