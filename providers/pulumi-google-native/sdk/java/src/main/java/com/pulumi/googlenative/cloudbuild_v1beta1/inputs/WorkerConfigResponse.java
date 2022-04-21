// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the configuration to be used for creating workers in the pool.
 * 
 */
public final class WorkerConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkerConfigResponse Empty = new WorkerConfigResponse();

    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private String diskSizeGb;

    public String diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Machine type of a worker, such as `n1-standard-1`. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    @Import(name="noExternalIp", required=true)
    private Boolean noExternalIp;

    public Boolean noExternalIp() {
        return this.noExternalIp;
    }

    private WorkerConfigResponse() {}

    private WorkerConfigResponse(WorkerConfigResponse $) {
        this.diskSizeGb = $.diskSizeGb;
        this.machineType = $.machineType;
        this.noExternalIp = $.noExternalIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerConfigResponse $;

        public Builder() {
            $ = new WorkerConfigResponse();
        }

        public Builder(WorkerConfigResponse defaults) {
            $ = new WorkerConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder diskSizeGb(String diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder noExternalIp(Boolean noExternalIp) {
            $.noExternalIp = noExternalIp;
            return this;
        }

        public WorkerConfigResponse build() {
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            $.noExternalIp = Objects.requireNonNull($.noExternalIp, "expected parameter 'noExternalIp' to be non-null");
            return $;
        }
    }

}
