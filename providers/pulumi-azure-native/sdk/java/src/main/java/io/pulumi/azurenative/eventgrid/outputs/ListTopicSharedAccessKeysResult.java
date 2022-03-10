// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListTopicSharedAccessKeysResult {
    /**
     * Shared access key1 for the topic.
     * 
     */
    private final @Nullable String key1;
    /**
     * Shared access key2 for the topic.
     * 
     */
    private final @Nullable String key2;

    @OutputCustomType.Constructor
    private ListTopicSharedAccessKeysResult(
        @OutputCustomType.Parameter("key1") @Nullable String key1,
        @OutputCustomType.Parameter("key2") @Nullable String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    /**
     * Shared access key1 for the topic.
     * 
    */
    public Optional<String> getKey1() {
        return Optional.ofNullable(this.key1);
    }
    /**
     * Shared access key2 for the topic.
     * 
    */
    public Optional<String> getKey2() {
        return Optional.ofNullable(this.key2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTopicSharedAccessKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key1;
        private @Nullable String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTopicSharedAccessKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder key1(@Nullable String key1) {
            this.key1 = key1;
            return this;
        }

        public Builder key2(@Nullable String key2) {
            this.key2 = key2;
            return this;
        }
        public ListTopicSharedAccessKeysResult build() {
            return new ListTopicSharedAccessKeysResult(key1, key2);
        }
    }
}
