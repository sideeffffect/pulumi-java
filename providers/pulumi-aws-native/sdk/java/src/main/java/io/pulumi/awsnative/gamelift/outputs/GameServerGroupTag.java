// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerGroupTag {
    /**
     * The key for a developer-defined key:value pair for tagging an AWS resource.
     * 
     */
    private final @Nullable String key;
    /**
     * The value for a developer-defined key:value pair for tagging an AWS resource.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private GameServerGroupTag(
        @OutputCustomType.Parameter("key") @Nullable String key,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key for a developer-defined key:value pair for tagging an AWS resource.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The value for a developer-defined key:value pair for tagging an AWS resource.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GameServerGroupTag build() {
            return new GameServerGroupTag(key, value);
        }
    }
}
