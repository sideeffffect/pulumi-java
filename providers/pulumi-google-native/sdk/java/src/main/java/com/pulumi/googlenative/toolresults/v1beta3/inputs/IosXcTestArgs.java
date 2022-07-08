// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A test of an iOS application that uses the XCTest framework.
 * 
 */
public final class IosXcTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosXcTestArgs Empty = new IosXcTestArgs();

    /**
     * Bundle ID of the app.
     * 
     */
    @Import(name="bundleId")
    private @Nullable Output<String> bundleId;

    /**
     * @return Bundle ID of the app.
     * 
     */
    public Optional<Output<String>> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }

    /**
     * Xcode version that the test was run with.
     * 
     */
    @Import(name="xcodeVersion")
    private @Nullable Output<String> xcodeVersion;

    /**
     * @return Xcode version that the test was run with.
     * 
     */
    public Optional<Output<String>> xcodeVersion() {
        return Optional.ofNullable(this.xcodeVersion);
    }

    private IosXcTestArgs() {}

    private IosXcTestArgs(IosXcTestArgs $) {
        this.bundleId = $.bundleId;
        this.xcodeVersion = $.xcodeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosXcTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosXcTestArgs $;

        public Builder() {
            $ = new IosXcTestArgs();
        }

        public Builder(IosXcTestArgs defaults) {
            $ = new IosXcTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundleId Bundle ID of the app.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(@Nullable Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        /**
         * @param bundleId Bundle ID of the app.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        /**
         * @param xcodeVersion Xcode version that the test was run with.
         * 
         * @return builder
         * 
         */
        public Builder xcodeVersion(@Nullable Output<String> xcodeVersion) {
            $.xcodeVersion = xcodeVersion;
            return this;
        }

        /**
         * @param xcodeVersion Xcode version that the test was run with.
         * 
         * @return builder
         * 
         */
        public Builder xcodeVersion(String xcodeVersion) {
            return xcodeVersion(Output.of(xcodeVersion));
        }

        public IosXcTestArgs build() {
            return $;
        }
    }

}
