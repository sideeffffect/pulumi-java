// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeSoftwareConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeSoftwareConfigGetArgs Empty = new RuntimeSoftwareConfigGetArgs();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
    private @Nullable Output<String> customGpuDriverPath;

    public Optional<Output<String>> customGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }

    /**
     * Verifies core internal services are running. Default: True.
     * 
     */
    @Import(name="enableHealthMonitoring")
    private @Nullable Output<Boolean> enableHealthMonitoring;

    public Optional<Output<Boolean>> enableHealthMonitoring() {
        return Optional.ofNullable(this.enableHealthMonitoring);
    }

    /**
     * Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    @Import(name="idleShutdown")
    private @Nullable Output<Boolean> idleShutdown;

    public Optional<Output<Boolean>> idleShutdown() {
        return Optional.ofNullable(this.idleShutdown);
    }

    /**
     * Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    @Import(name="idleShutdownTimeout")
    private @Nullable Output<Integer> idleShutdownTimeout;

    public Optional<Output<Integer>> idleShutdownTimeout() {
        return Optional.ofNullable(this.idleShutdownTimeout);
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @Import(name="installGpuDriver")
    private @Nullable Output<Boolean> installGpuDriver;

    public Optional<Output<Boolean>> installGpuDriver() {
        return Optional.ofNullable(this.installGpuDriver);
    }

    /**
     * Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @Import(name="notebookUpgradeSchedule")
    private @Nullable Output<String> notebookUpgradeSchedule;

    public Optional<Output<String>> notebookUpgradeSchedule() {
        return Optional.ofNullable(this.notebookUpgradeSchedule);
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @Import(name="postStartupScript")
    private @Nullable Output<String> postStartupScript;

    public Optional<Output<String>> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    private RuntimeSoftwareConfigGetArgs() {}

    private RuntimeSoftwareConfigGetArgs(RuntimeSoftwareConfigGetArgs $) {
        this.customGpuDriverPath = $.customGpuDriverPath;
        this.enableHealthMonitoring = $.enableHealthMonitoring;
        this.idleShutdown = $.idleShutdown;
        this.idleShutdownTimeout = $.idleShutdownTimeout;
        this.installGpuDriver = $.installGpuDriver;
        this.notebookUpgradeSchedule = $.notebookUpgradeSchedule;
        this.postStartupScript = $.postStartupScript;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeSoftwareConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeSoftwareConfigGetArgs $;

        public Builder() {
            $ = new RuntimeSoftwareConfigGetArgs();
        }

        public Builder(RuntimeSoftwareConfigGetArgs defaults) {
            $ = new RuntimeSoftwareConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            $.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder customGpuDriverPath(String customGpuDriverPath) {
            return customGpuDriverPath(Output.of(customGpuDriverPath));
        }

        public Builder enableHealthMonitoring(@Nullable Output<Boolean> enableHealthMonitoring) {
            $.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }

        public Builder enableHealthMonitoring(Boolean enableHealthMonitoring) {
            return enableHealthMonitoring(Output.of(enableHealthMonitoring));
        }

        public Builder idleShutdown(@Nullable Output<Boolean> idleShutdown) {
            $.idleShutdown = idleShutdown;
            return this;
        }

        public Builder idleShutdown(Boolean idleShutdown) {
            return idleShutdown(Output.of(idleShutdown));
        }

        public Builder idleShutdownTimeout(@Nullable Output<Integer> idleShutdownTimeout) {
            $.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }

        public Builder idleShutdownTimeout(Integer idleShutdownTimeout) {
            return idleShutdownTimeout(Output.of(idleShutdownTimeout));
        }

        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            $.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder installGpuDriver(Boolean installGpuDriver) {
            return installGpuDriver(Output.of(installGpuDriver));
        }

        public Builder notebookUpgradeSchedule(@Nullable Output<String> notebookUpgradeSchedule) {
            $.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }

        public Builder notebookUpgradeSchedule(String notebookUpgradeSchedule) {
            return notebookUpgradeSchedule(Output.of(notebookUpgradeSchedule));
        }

        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        public Builder postStartupScript(String postStartupScript) {
            return postStartupScript(Output.of(postStartupScript));
        }

        public RuntimeSoftwareConfigGetArgs build() {
            return $;
        }
    }

}
