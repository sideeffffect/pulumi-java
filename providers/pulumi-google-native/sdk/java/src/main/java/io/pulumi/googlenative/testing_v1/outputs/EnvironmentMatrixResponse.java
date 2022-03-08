// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.AndroidDeviceListResponse;
import io.pulumi.googlenative.testing_v1.outputs.AndroidMatrixResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosDeviceListResponse;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentMatrixResponse {
    /**
     * A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    private final AndroidDeviceListResponse androidDeviceList;
    /**
     * A matrix of Android devices.
     * 
     */
    private final AndroidMatrixResponse androidMatrix;
    /**
     * A list of iOS devices.
     * 
     */
    private final IosDeviceListResponse iosDeviceList;

    @OutputCustomType.Constructor({"androidDeviceList","androidMatrix","iosDeviceList"})
    private EnvironmentMatrixResponse(
        AndroidDeviceListResponse androidDeviceList,
        AndroidMatrixResponse androidMatrix,
        IosDeviceListResponse iosDeviceList) {
        this.androidDeviceList = androidDeviceList;
        this.androidMatrix = androidMatrix;
        this.iosDeviceList = iosDeviceList;
    }

    /**
     * A list of Android devices; the test will be run only on the specified devices.
     * 
    */
    public AndroidDeviceListResponse getAndroidDeviceList() {
        return this.androidDeviceList;
    }
    /**
     * A matrix of Android devices.
     * 
    */
    public AndroidMatrixResponse getAndroidMatrix() {
        return this.androidMatrix;
    }
    /**
     * A list of iOS devices.
     * 
    */
    public IosDeviceListResponse getIosDeviceList() {
        return this.iosDeviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMatrixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceListResponse androidDeviceList;
        private AndroidMatrixResponse androidMatrix;
        private IosDeviceListResponse iosDeviceList;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMatrixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDeviceList = defaults.androidDeviceList;
    	      this.androidMatrix = defaults.androidMatrix;
    	      this.iosDeviceList = defaults.iosDeviceList;
        }

        public Builder setAndroidDeviceList(AndroidDeviceListResponse androidDeviceList) {
            this.androidDeviceList = Objects.requireNonNull(androidDeviceList);
            return this;
        }

        public Builder setAndroidMatrix(AndroidMatrixResponse androidMatrix) {
            this.androidMatrix = Objects.requireNonNull(androidMatrix);
            return this;
        }

        public Builder setIosDeviceList(IosDeviceListResponse iosDeviceList) {
            this.iosDeviceList = Objects.requireNonNull(iosDeviceList);
            return this;
        }
        public EnvironmentMatrixResponse build() {
            return new EnvironmentMatrixResponse(androidDeviceList, androidMatrix, iosDeviceList);
        }
    }
}
