// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANGatewayVersion;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionLoRaWANUpdateGatewayTaskEntry extends io.pulumi.resources.InvokeArgs {

    public static final TaskDefinitionLoRaWANUpdateGatewayTaskEntry Empty = new TaskDefinitionLoRaWANUpdateGatewayTaskEntry();

    @InputImport(name="currentVersion")
      private final @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;

    public Optional<TaskDefinitionLoRaWANGatewayVersion> getCurrentVersion() {
        return this.currentVersion == null ? Optional.empty() : Optional.ofNullable(this.currentVersion);
    }

    @InputImport(name="updateVersion")
      private final @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

    public Optional<TaskDefinitionLoRaWANGatewayVersion> getUpdateVersion() {
        return this.updateVersion == null ? Optional.empty() : Optional.ofNullable(this.updateVersion);
    }

    public TaskDefinitionLoRaWANUpdateGatewayTaskEntry(
        @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion,
        @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
        this.currentVersion = currentVersion;
        this.updateVersion = updateVersion;
    }

    private TaskDefinitionLoRaWANUpdateGatewayTaskEntry() {
        this.currentVersion = null;
        this.updateVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLoRaWANUpdateGatewayTaskEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;
        private @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLoRaWANUpdateGatewayTaskEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.updateVersion = defaults.updateVersion;
        }

        public Builder currentVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder updateVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public TaskDefinitionLoRaWANUpdateGatewayTaskEntry build() {
            return new TaskDefinitionLoRaWANUpdateGatewayTaskEntry(currentVersion, updateVersion);
        }
    }
}
