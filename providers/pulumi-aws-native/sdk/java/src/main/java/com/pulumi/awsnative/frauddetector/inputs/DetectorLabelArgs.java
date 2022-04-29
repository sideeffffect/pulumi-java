// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorLabelArgs extends ResourceArgs {

    public static final DetectorLabelArgs Empty = new DetectorLabelArgs();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time when the label was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    /**
     * @return The time when the label was created.
     * 
     */
    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="inline")
    private @Nullable Output<Boolean> inline;

    public Optional<Output<Boolean>> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * The time when the label was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable Output<String> lastUpdatedTime;

    /**
     * @return The time when the label was last updated.
     * 
     */
    public Optional<Output<String>> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this label.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DetectorTagArgs>> tags;

    /**
     * @return Tags associated with this label.
     * 
     */
    public Optional<Output<List<DetectorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DetectorLabelArgs() {}

    private DetectorLabelArgs(DetectorLabelArgs $) {
        this.arn = $.arn;
        this.createdTime = $.createdTime;
        this.description = $.description;
        this.inline = $.inline;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorLabelArgs $;

        public Builder() {
            $ = new DetectorLabelArgs();
        }

        public Builder(DetectorLabelArgs defaults) {
            $ = new DetectorLabelArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param createdTime The time when the label was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        /**
         * @param createdTime The time when the label was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder inline(@Nullable Output<Boolean> inline) {
            $.inline = inline;
            return this;
        }

        public Builder inline(Boolean inline) {
            return inline(Output.of(inline));
        }

        /**
         * @param lastUpdatedTime The time when the label was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        /**
         * @param lastUpdatedTime The time when the label was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTime(String lastUpdatedTime) {
            return lastUpdatedTime(Output.of(lastUpdatedTime));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DetectorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DetectorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(DetectorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DetectorLabelArgs build() {
            return $;
        }
    }

}
