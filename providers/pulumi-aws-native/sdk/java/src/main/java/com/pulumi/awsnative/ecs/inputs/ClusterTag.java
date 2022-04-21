// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define.
 * 
 */
public final class ClusterTag extends com.pulumi.resources.InvokeArgs {

    public static final ClusterTag Empty = new ClusterTag();

    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private ClusterTag() {}

    private ClusterTag(ClusterTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTag $;

        public Builder() {
            $ = new ClusterTag();
        }

        public Builder(ClusterTag defaults) {
            $ = new ClusterTag(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public ClusterTag build() {
            return $;
        }
    }

}
