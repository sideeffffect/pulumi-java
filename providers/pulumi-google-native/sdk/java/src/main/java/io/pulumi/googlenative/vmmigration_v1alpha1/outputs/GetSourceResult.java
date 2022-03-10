// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.VmwareSourceDetailsResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSourceResult {
    /**
     * The create time timestamp.
     * 
     */
    private final String createTime;
    /**
     * User-provided description of the source.
     * 
     */
    private final String description;
    /**
     * Provides details on the state of the Source in case of an error.
     * 
     */
    private final StatusResponse error;
    /**
     * The labels of the source.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The Source name.
     * 
     */
    private final String name;
    /**
     * The update time timestamp.
     * 
     */
    private final String updateTime;
    /**
     * Vmware type source details.
     * 
     */
    private final VmwareSourceDetailsResponse vmware;

    @OutputCustomType.Constructor
    private GetSourceResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("error") StatusResponse error,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("vmware") VmwareSourceDetailsResponse vmware) {
        this.createTime = createTime;
        this.description = description;
        this.error = error;
        this.labels = labels;
        this.name = name;
        this.updateTime = updateTime;
        this.vmware = vmware;
    }

    /**
     * The create time timestamp.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the source.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Provides details on the state of the Source in case of an error.
     * 
    */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The labels of the source.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The Source name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The update time timestamp.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Vmware type source details.
     * 
    */
    public VmwareSourceDetailsResponse getVmware() {
        return this.vmware;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private StatusResponse error;
        private Map<String,String> labels;
        private String name;
        private String updateTime;
        private VmwareSourceDetailsResponse vmware;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
    	      this.vmware = defaults.vmware;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder vmware(VmwareSourceDetailsResponse vmware) {
            this.vmware = Objects.requireNonNull(vmware);
            return this;
        }
        public GetSourceResult build() {
            return new GetSourceResult(createTime, description, error, labels, name, updateTime, vmware);
        }
    }
}
