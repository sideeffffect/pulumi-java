// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StagingSettingsResponse {
    /**
     * Specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableCompression;
    /**
     * Staging linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object path;

    @OutputCustomType.Constructor
    private StagingSettingsResponse(
        @OutputCustomType.Parameter("enableCompression") @Nullable Object enableCompression,
        @OutputCustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @OutputCustomType.Parameter("path") @Nullable Object path) {
        this.enableCompression = enableCompression;
        this.linkedServiceName = linkedServiceName;
        this.path = path;
    }

    /**
     * Specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableCompression() {
        return Optional.ofNullable(this.enableCompression);
    }
    /**
     * Staging linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StagingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object enableCompression;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(StagingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCompression = defaults.enableCompression;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder enableCompression(@Nullable Object enableCompression) {
            this.enableCompression = enableCompression;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder path(@Nullable Object path) {
            this.path = path;
            return this;
        }
        public StagingSettingsResponse build() {
            return new StagingSettingsResponse(enableCompression, linkedServiceName, path);
        }
    }
}
