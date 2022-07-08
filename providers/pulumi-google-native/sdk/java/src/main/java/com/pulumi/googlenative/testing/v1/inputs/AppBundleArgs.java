// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing.v1.inputs.FileReferenceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Android App Bundle file format, containing a BundleConfig.pb file, a base module directory, zero or more dynamic feature module directories. See https://developer.android.com/guide/app-bundle/build for guidance on building App Bundles.
 * 
 */
public final class AppBundleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppBundleArgs Empty = new AppBundleArgs();

    /**
     * .aab file representing the app bundle under test.
     * 
     */
    @Import(name="bundleLocation")
    private @Nullable Output<FileReferenceArgs> bundleLocation;

    /**
     * @return .aab file representing the app bundle under test.
     * 
     */
    public Optional<Output<FileReferenceArgs>> bundleLocation() {
        return Optional.ofNullable(this.bundleLocation);
    }

    private AppBundleArgs() {}

    private AppBundleArgs(AppBundleArgs $) {
        this.bundleLocation = $.bundleLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppBundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppBundleArgs $;

        public Builder() {
            $ = new AppBundleArgs();
        }

        public Builder(AppBundleArgs defaults) {
            $ = new AppBundleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundleLocation .aab file representing the app bundle under test.
         * 
         * @return builder
         * 
         */
        public Builder bundleLocation(@Nullable Output<FileReferenceArgs> bundleLocation) {
            $.bundleLocation = bundleLocation;
            return this;
        }

        /**
         * @param bundleLocation .aab file representing the app bundle under test.
         * 
         * @return builder
         * 
         */
        public Builder bundleLocation(FileReferenceArgs bundleLocation) {
            return bundleLocation(Output.of(bundleLocation));
        }

        public AppBundleArgs build() {
            return $;
        }
    }

}
