// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AndroidDeviceListResponse;
import io.pulumi.googlenative.testing_v1.inputs.AndroidMatrixResponse;
import io.pulumi.googlenative.testing_v1.inputs.IosDeviceListResponse;
import java.util.Objects;


/**
 * The matrix of environments in which the test is to be executed.
 * 
 */
public final class EnvironmentMatrixResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentMatrixResponse Empty = new EnvironmentMatrixResponse();

    /**
     * A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    @InputImport(name="androidDeviceList", required=true)
      private final AndroidDeviceListResponse androidDeviceList;

    public AndroidDeviceListResponse getAndroidDeviceList() {
        return this.androidDeviceList;
    }

    /**
     * A matrix of Android devices.
     * 
     */
    @InputImport(name="androidMatrix", required=true)
      private final AndroidMatrixResponse androidMatrix;

    public AndroidMatrixResponse getAndroidMatrix() {
        return this.androidMatrix;
    }

    /**
     * A list of iOS devices.
     * 
     */
    @InputImport(name="iosDeviceList", required=true)
      private final IosDeviceListResponse iosDeviceList;

    public IosDeviceListResponse getIosDeviceList() {
        return this.iosDeviceList;
    }

    public EnvironmentMatrixResponse(
        AndroidDeviceListResponse androidDeviceList,
        AndroidMatrixResponse androidMatrix,
        IosDeviceListResponse iosDeviceList) {
        this.androidDeviceList = Objects.requireNonNull(androidDeviceList, "expected parameter 'androidDeviceList' to be non-null");
        this.androidMatrix = Objects.requireNonNull(androidMatrix, "expected parameter 'androidMatrix' to be non-null");
        this.iosDeviceList = Objects.requireNonNull(iosDeviceList, "expected parameter 'iosDeviceList' to be non-null");
    }

    private EnvironmentMatrixResponse() {
        this.androidDeviceList = null;
        this.androidMatrix = null;
        this.iosDeviceList = null;
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

        public Builder androidDeviceList(AndroidDeviceListResponse androidDeviceList) {
            this.androidDeviceList = Objects.requireNonNull(androidDeviceList);
            return this;
        }

        public Builder androidMatrix(AndroidMatrixResponse androidMatrix) {
            this.androidMatrix = Objects.requireNonNull(androidMatrix);
            return this;
        }

        public Builder iosDeviceList(IosDeviceListResponse iosDeviceList) {
            this.iosDeviceList = Objects.requireNonNull(iosDeviceList);
            return this;
        }
        public EnvironmentMatrixResponse build() {
            return new EnvironmentMatrixResponse(androidDeviceList, androidMatrix, iosDeviceList);
        }
    }
}
