// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.ObbFileResponse;
import io.pulumi.googlenative.testing_v1.outputs.RegularFileResponse;
import java.util.Objects;

@OutputCustomType
public final class DeviceFileResponse {
    /**
     * A reference to an opaque binary blob file.
     * 
     */
    private final ObbFileResponse obbFile;
    /**
     * A reference to a regular file.
     * 
     */
    private final RegularFileResponse regularFile;

    @OutputCustomType.Constructor
    private DeviceFileResponse(
        @OutputCustomType.Parameter("obbFile") ObbFileResponse obbFile,
        @OutputCustomType.Parameter("regularFile") RegularFileResponse regularFile) {
        this.obbFile = obbFile;
        this.regularFile = regularFile;
    }

    /**
     * A reference to an opaque binary blob file.
     * 
    */
    public ObbFileResponse getObbFile() {
        return this.obbFile;
    }
    /**
     * A reference to a regular file.
     * 
    */
    public RegularFileResponse getRegularFile() {
        return this.regularFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObbFileResponse obbFile;
        private RegularFileResponse regularFile;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obbFile = defaults.obbFile;
    	      this.regularFile = defaults.regularFile;
        }

        public Builder obbFile(ObbFileResponse obbFile) {
            this.obbFile = Objects.requireNonNull(obbFile);
            return this;
        }

        public Builder regularFile(RegularFileResponse regularFile) {
            this.regularFile = Objects.requireNonNull(regularFile);
            return this;
        }
        public DeviceFileResponse build() {
            return new DeviceFileResponse(obbFile, regularFile);
        }
    }
}
