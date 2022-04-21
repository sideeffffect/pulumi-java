// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.inputs.ContainerImageResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the selection and configuration of software inside the runtime. The properties to set on runtime. Properties keys are specified in `key:value` format, for example: * `idle_shutdown: true` * `idle_shutdown_timeout: 180` * `enable_health_monitoring: true`
 * 
 */
public final class RuntimeSoftwareConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuntimeSoftwareConfigResponse Empty = new RuntimeSoftwareConfigResponse();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath", required=true)
    private String customGpuDriverPath;

    public String customGpuDriverPath() {
        return this.customGpuDriverPath;
    }

    /**
     * Verifies core internal services are running. Default: True
     * 
     */
    @Import(name="enableHealthMonitoring", required=true)
    private Boolean enableHealthMonitoring;

    public Boolean enableHealthMonitoring() {
        return this.enableHealthMonitoring;
    }

    /**
     * Runtime will automatically shutdown after idle_shutdown_time. Default: True
     * 
     */
    @Import(name="idleShutdown", required=true)
    private Boolean idleShutdown;

    public Boolean idleShutdown() {
        return this.idleShutdown;
    }

    /**
     * Time in minutes to wait before shutting down runtime. Default: 180 minutes
     * 
     */
    @Import(name="idleShutdownTimeout", required=true)
    private Integer idleShutdownTimeout;

    public Integer idleShutdownTimeout() {
        return this.idleShutdownTimeout;
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @Import(name="installGpuDriver", required=true)
    private Boolean installGpuDriver;

    public Boolean installGpuDriver() {
        return this.installGpuDriver;
    }

    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    @Import(name="kernels", required=true)
    private List<ContainerImageResponse> kernels;

    public List<ContainerImageResponse> kernels() {
        return this.kernels;
    }

    /**
     * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @Import(name="notebookUpgradeSchedule", required=true)
    private String notebookUpgradeSchedule;

    public String notebookUpgradeSchedule() {
        return this.notebookUpgradeSchedule;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    @Import(name="postStartupScript", required=true)
    private String postStartupScript;

    public String postStartupScript() {
        return this.postStartupScript;
    }

    private RuntimeSoftwareConfigResponse() {}

    private RuntimeSoftwareConfigResponse(RuntimeSoftwareConfigResponse $) {
        this.customGpuDriverPath = $.customGpuDriverPath;
        this.enableHealthMonitoring = $.enableHealthMonitoring;
        this.idleShutdown = $.idleShutdown;
        this.idleShutdownTimeout = $.idleShutdownTimeout;
        this.installGpuDriver = $.installGpuDriver;
        this.kernels = $.kernels;
        this.notebookUpgradeSchedule = $.notebookUpgradeSchedule;
        this.postStartupScript = $.postStartupScript;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeSoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeSoftwareConfigResponse $;

        public Builder() {
            $ = new RuntimeSoftwareConfigResponse();
        }

        public Builder(RuntimeSoftwareConfigResponse defaults) {
            $ = new RuntimeSoftwareConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder customGpuDriverPath(String customGpuDriverPath) {
            $.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder enableHealthMonitoring(Boolean enableHealthMonitoring) {
            $.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }

        public Builder idleShutdown(Boolean idleShutdown) {
            $.idleShutdown = idleShutdown;
            return this;
        }

        public Builder idleShutdownTimeout(Integer idleShutdownTimeout) {
            $.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }

        public Builder installGpuDriver(Boolean installGpuDriver) {
            $.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder kernels(List<ContainerImageResponse> kernels) {
            $.kernels = kernels;
            return this;
        }

        public Builder kernels(ContainerImageResponse... kernels) {
            return kernels(List.of(kernels));
        }

        public Builder notebookUpgradeSchedule(String notebookUpgradeSchedule) {
            $.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }

        public Builder postStartupScript(String postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        public RuntimeSoftwareConfigResponse build() {
            $.customGpuDriverPath = Objects.requireNonNull($.customGpuDriverPath, "expected parameter 'customGpuDriverPath' to be non-null");
            $.enableHealthMonitoring = Objects.requireNonNull($.enableHealthMonitoring, "expected parameter 'enableHealthMonitoring' to be non-null");
            $.idleShutdown = Objects.requireNonNull($.idleShutdown, "expected parameter 'idleShutdown' to be non-null");
            $.idleShutdownTimeout = Objects.requireNonNull($.idleShutdownTimeout, "expected parameter 'idleShutdownTimeout' to be non-null");
            $.installGpuDriver = Objects.requireNonNull($.installGpuDriver, "expected parameter 'installGpuDriver' to be non-null");
            $.kernels = Objects.requireNonNull($.kernels, "expected parameter 'kernels' to be non-null");
            $.notebookUpgradeSchedule = Objects.requireNonNull($.notebookUpgradeSchedule, "expected parameter 'notebookUpgradeSchedule' to be non-null");
            $.postStartupScript = Objects.requireNonNull($.postStartupScript, "expected parameter 'postStartupScript' to be non-null");
            return $;
        }
    }

}
