// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains encryption settings for an OS disk image.
 * 
 */
public final class OSDiskImageEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSDiskImageEncryptionArgs Empty = new OSDiskImageEncryptionArgs();

    /**
     * A relative URI containing the resource ID of the disk encryption set.
     * 
     */
    @InputImport(name="diskEncryptionSetId")
      private final @Nullable Input<String> diskEncryptionSetId;

    public Input<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Input.empty() : this.diskEncryptionSetId;
    }

    public OSDiskImageEncryptionArgs(@Nullable Input<String> diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
    }

    private OSDiskImageEncryptionArgs() {
        this.diskEncryptionSetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDiskImageEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskEncryptionSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDiskImageEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
        }

        public Builder diskEncryptionSetId(@Nullable Input<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Input.ofNullable(diskEncryptionSetId);
            return this;
        }
        public OSDiskImageEncryptionArgs build() {
            return new OSDiskImageEncryptionArgs(diskEncryptionSetId);
        }
    }
}
