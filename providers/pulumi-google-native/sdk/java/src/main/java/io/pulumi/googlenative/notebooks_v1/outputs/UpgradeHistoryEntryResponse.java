// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UpgradeHistoryEntryResponse {
    /**
     * Action. Rolloback or Upgrade.
     * 
     */
    private final String action;
    /**
     * The container image before this instance upgrade.
     * 
     */
    private final String containerImage;
    /**
     * The time that this instance upgrade history entry is created.
     * 
     */
    private final String createTime;
    /**
     * The framework of this notebook instance.
     * 
     */
    private final String framework;
    /**
     * The snapshot of the boot disk of this notebook instance before upgrade.
     * 
     */
    private final String snapshot;
    /**
     * The state of this instance upgrade history entry.
     * 
     */
    private final String state;
    /**
     * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
     */
    private final String targetImage;
    /**
     * Target VM Version, like m63.
     * 
     */
    private final String targetVersion;
    /**
     * The version of the notebook instance before this upgrade.
     * 
     */
    private final String version;
    /**
     * The VM image before this instance upgrade.
     * 
     */
    private final String vmImage;

    @OutputCustomType.Constructor({"action","containerImage","createTime","framework","snapshot","state","targetImage","targetVersion","version","vmImage"})
    private UpgradeHistoryEntryResponse(
        String action,
        String containerImage,
        String createTime,
        String framework,
        String snapshot,
        String state,
        String targetImage,
        String targetVersion,
        String version,
        String vmImage) {
        this.action = action;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.framework = framework;
        this.snapshot = snapshot;
        this.state = state;
        this.targetImage = targetImage;
        this.targetVersion = targetVersion;
        this.version = version;
        this.vmImage = vmImage;
    }

    /**
     * Action. Rolloback or Upgrade.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * The container image before this instance upgrade.
     * 
    */
    public String getContainerImage() {
        return this.containerImage;
    }
    /**
     * The time that this instance upgrade history entry is created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The framework of this notebook instance.
     * 
    */
    public String getFramework() {
        return this.framework;
    }
    /**
     * The snapshot of the boot disk of this notebook instance before upgrade.
     * 
    */
    public String getSnapshot() {
        return this.snapshot;
    }
    /**
     * The state of this instance upgrade history entry.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
    */
    public String getTargetImage() {
        return this.targetImage;
    }
    /**
     * Target VM Version, like m63.
     * 
    */
    public String getTargetVersion() {
        return this.targetVersion;
    }
    /**
     * The version of the notebook instance before this upgrade.
     * 
    */
    public String getVersion() {
        return this.version;
    }
    /**
     * The VM image before this instance upgrade.
     * 
    */
    public String getVmImage() {
        return this.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeHistoryEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String containerImage;
        private String createTime;
        private String framework;
        private String snapshot;
        private String state;
        private String targetImage;
        private String targetVersion;
        private String version;
        private String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeHistoryEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.framework = defaults.framework;
    	      this.snapshot = defaults.snapshot;
    	      this.state = defaults.state;
    	      this.targetImage = defaults.targetImage;
    	      this.targetVersion = defaults.targetVersion;
    	      this.version = defaults.version;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setContainerImage(String containerImage) {
            this.containerImage = Objects.requireNonNull(containerImage);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setFramework(String framework) {
            this.framework = Objects.requireNonNull(framework);
            return this;
        }

        public Builder setSnapshot(String snapshot) {
            this.snapshot = Objects.requireNonNull(snapshot);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTargetImage(String targetImage) {
            this.targetImage = Objects.requireNonNull(targetImage);
            return this;
        }

        public Builder setTargetVersion(String targetVersion) {
            this.targetVersion = Objects.requireNonNull(targetVersion);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVmImage(String vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }
        public UpgradeHistoryEntryResponse build() {
            return new UpgradeHistoryEntryResponse(action, containerImage, createTime, framework, snapshot, state, targetImage, targetVersion, version, vmImage);
        }
    }
}
