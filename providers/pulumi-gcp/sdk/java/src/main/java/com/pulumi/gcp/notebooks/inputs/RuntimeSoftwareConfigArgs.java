// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeSoftwareConfigArgs extends ResourceArgs {

    public static final RuntimeSoftwareConfigArgs Empty = new RuntimeSoftwareConfigArgs();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
    private @Nullable Output<String> customGpuDriverPath;

    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    public Optional<Output<String>> customGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }

    /**
     * Verifies core internal services are running. Default: True.
     * 
     */
    @Import(name="enableHealthMonitoring")
    private @Nullable Output<Boolean> enableHealthMonitoring;

    /**
     * @return Verifies core internal services are running. Default: True.
     * 
     */
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

    /**
     * @return Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
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

    /**
     * @return Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    public Optional<Output<Integer>> idleShutdownTimeout() {
        return Optional.ofNullable(this.idleShutdownTimeout);
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @Import(name="installGpuDriver")
    private @Nullable Output<Boolean> installGpuDriver;

    /**
     * @return Install Nvidia Driver automatically.
     * 
     */
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

    /**
     * @return Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
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

    /**
     * @return Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    public Optional<Output<String>> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    private RuntimeSoftwareConfigArgs() {}

    private RuntimeSoftwareConfigArgs(RuntimeSoftwareConfigArgs $) {
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
    public static Builder builder(RuntimeSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeSoftwareConfigArgs $;

        public Builder() {
            $ = new RuntimeSoftwareConfigArgs();
        }

        public Builder(RuntimeSoftwareConfigArgs defaults) {
            $ = new RuntimeSoftwareConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customGpuDriverPath Specify a custom Cloud Storage path where the GPU driver is stored.
         * If not specified, we&#39;ll automatically choose from official GPU drivers.
         * 
         * @return builder
         * 
         */
        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            $.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        /**
         * @param customGpuDriverPath Specify a custom Cloud Storage path where the GPU driver is stored.
         * If not specified, we&#39;ll automatically choose from official GPU drivers.
         * 
         * @return builder
         * 
         */
        public Builder customGpuDriverPath(String customGpuDriverPath) {
            return customGpuDriverPath(Output.of(customGpuDriverPath));
        }

        /**
         * @param enableHealthMonitoring Verifies core internal services are running. Default: True.
         * 
         * @return builder
         * 
         */
        public Builder enableHealthMonitoring(@Nullable Output<Boolean> enableHealthMonitoring) {
            $.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }

        /**
         * @param enableHealthMonitoring Verifies core internal services are running. Default: True.
         * 
         * @return builder
         * 
         */
        public Builder enableHealthMonitoring(Boolean enableHealthMonitoring) {
            return enableHealthMonitoring(Output.of(enableHealthMonitoring));
        }

        /**
         * @param idleShutdown Runtime will automatically shutdown after idle_shutdown_time.
         * Default: True
         * 
         * @return builder
         * 
         */
        public Builder idleShutdown(@Nullable Output<Boolean> idleShutdown) {
            $.idleShutdown = idleShutdown;
            return this;
        }

        /**
         * @param idleShutdown Runtime will automatically shutdown after idle_shutdown_time.
         * Default: True
         * 
         * @return builder
         * 
         */
        public Builder idleShutdown(Boolean idleShutdown) {
            return idleShutdown(Output.of(idleShutdown));
        }

        /**
         * @param idleShutdownTimeout Time in minutes to wait before shuting down runtime.
         * Default: 180 minutes
         * 
         * @return builder
         * 
         */
        public Builder idleShutdownTimeout(@Nullable Output<Integer> idleShutdownTimeout) {
            $.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }

        /**
         * @param idleShutdownTimeout Time in minutes to wait before shuting down runtime.
         * Default: 180 minutes
         * 
         * @return builder
         * 
         */
        public Builder idleShutdownTimeout(Integer idleShutdownTimeout) {
            return idleShutdownTimeout(Output.of(idleShutdownTimeout));
        }

        /**
         * @param installGpuDriver Install Nvidia Driver automatically.
         * 
         * @return builder
         * 
         */
        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            $.installGpuDriver = installGpuDriver;
            return this;
        }

        /**
         * @param installGpuDriver Install Nvidia Driver automatically.
         * 
         * @return builder
         * 
         */
        public Builder installGpuDriver(Boolean installGpuDriver) {
            return installGpuDriver(Output.of(installGpuDriver));
        }

        /**
         * @param notebookUpgradeSchedule Cron expression in UTC timezone for schedule instance auto upgrade.
         * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
         * 
         * @return builder
         * 
         */
        public Builder notebookUpgradeSchedule(@Nullable Output<String> notebookUpgradeSchedule) {
            $.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }

        /**
         * @param notebookUpgradeSchedule Cron expression in UTC timezone for schedule instance auto upgrade.
         * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
         * 
         * @return builder
         * 
         */
        public Builder notebookUpgradeSchedule(String notebookUpgradeSchedule) {
            return notebookUpgradeSchedule(Output.of(notebookUpgradeSchedule));
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance
         * fully boots up. The path must be a URL or
         * Cloud Storage path (gs://path-to-file/file-name).
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance
         * fully boots up. The path must be a URL or
         * Cloud Storage path (gs://path-to-file/file-name).
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(String postStartupScript) {
            return postStartupScript(Output.of(postStartupScript));
        }

        public RuntimeSoftwareConfigArgs build() {
            return $;
        }
    }

}
