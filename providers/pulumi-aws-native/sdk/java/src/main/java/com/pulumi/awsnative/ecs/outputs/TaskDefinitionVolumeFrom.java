// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionVolumeFrom {
    private final @Nullable Boolean readOnly;
    private final @Nullable String sourceContainer;

    @CustomType.Constructor
    private TaskDefinitionVolumeFrom(
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("sourceContainer") @Nullable String sourceContainer) {
        this.readOnly = readOnly;
        this.sourceContainer = sourceContainer;
    }

    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> sourceContainer() {
        return Optional.ofNullable(this.sourceContainer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFrom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean readOnly;
        private @Nullable String sourceContainer;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.sourceContainer = defaults.sourceContainer;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder sourceContainer(@Nullable String sourceContainer) {
            this.sourceContainer = sourceContainer;
            return this;
        }        public TaskDefinitionVolumeFrom build() {
            return new TaskDefinitionVolumeFrom(readOnly, sourceContainer);
        }
    }
}
