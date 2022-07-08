// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.DurationArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.IosAppInfoArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.IosRoboTestArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.IosTestLoopArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.IosXcTestArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A iOS mobile test specification
 * 
 */
public final class IosTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosTestArgs Empty = new IosTestArgs();

    /**
     * Information about the application under test.
     * 
     */
    @Import(name="iosAppInfo")
    private @Nullable Output<IosAppInfoArgs> iosAppInfo;

    /**
     * @return Information about the application under test.
     * 
     */
    public Optional<Output<IosAppInfoArgs>> iosAppInfo() {
        return Optional.ofNullable(this.iosAppInfo);
    }

    /**
     * An iOS Robo test.
     * 
     */
    @Import(name="iosRoboTest")
    private @Nullable Output<IosRoboTestArgs> iosRoboTest;

    /**
     * @return An iOS Robo test.
     * 
     */
    public Optional<Output<IosRoboTestArgs>> iosRoboTest() {
        return Optional.ofNullable(this.iosRoboTest);
    }

    /**
     * An iOS test loop.
     * 
     */
    @Import(name="iosTestLoop")
    private @Nullable Output<IosTestLoopArgs> iosTestLoop;

    /**
     * @return An iOS test loop.
     * 
     */
    public Optional<Output<IosTestLoopArgs>> iosTestLoop() {
        return Optional.ofNullable(this.iosTestLoop);
    }

    /**
     * An iOS XCTest.
     * 
     */
    @Import(name="iosXcTest")
    private @Nullable Output<IosXcTestArgs> iosXcTest;

    /**
     * @return An iOS XCTest.
     * 
     */
    public Optional<Output<IosXcTestArgs>> iosXcTest() {
        return Optional.ofNullable(this.iosXcTest);
    }

    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    @Import(name="testTimeout")
    private @Nullable Output<DurationArgs> testTimeout;

    /**
     * @return Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    public Optional<Output<DurationArgs>> testTimeout() {
        return Optional.ofNullable(this.testTimeout);
    }

    private IosTestArgs() {}

    private IosTestArgs(IosTestArgs $) {
        this.iosAppInfo = $.iosAppInfo;
        this.iosRoboTest = $.iosRoboTest;
        this.iosTestLoop = $.iosTestLoop;
        this.iosXcTest = $.iosXcTest;
        this.testTimeout = $.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosTestArgs $;

        public Builder() {
            $ = new IosTestArgs();
        }

        public Builder(IosTestArgs defaults) {
            $ = new IosTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iosAppInfo Information about the application under test.
         * 
         * @return builder
         * 
         */
        public Builder iosAppInfo(@Nullable Output<IosAppInfoArgs> iosAppInfo) {
            $.iosAppInfo = iosAppInfo;
            return this;
        }

        /**
         * @param iosAppInfo Information about the application under test.
         * 
         * @return builder
         * 
         */
        public Builder iosAppInfo(IosAppInfoArgs iosAppInfo) {
            return iosAppInfo(Output.of(iosAppInfo));
        }

        /**
         * @param iosRoboTest An iOS Robo test.
         * 
         * @return builder
         * 
         */
        public Builder iosRoboTest(@Nullable Output<IosRoboTestArgs> iosRoboTest) {
            $.iosRoboTest = iosRoboTest;
            return this;
        }

        /**
         * @param iosRoboTest An iOS Robo test.
         * 
         * @return builder
         * 
         */
        public Builder iosRoboTest(IosRoboTestArgs iosRoboTest) {
            return iosRoboTest(Output.of(iosRoboTest));
        }

        /**
         * @param iosTestLoop An iOS test loop.
         * 
         * @return builder
         * 
         */
        public Builder iosTestLoop(@Nullable Output<IosTestLoopArgs> iosTestLoop) {
            $.iosTestLoop = iosTestLoop;
            return this;
        }

        /**
         * @param iosTestLoop An iOS test loop.
         * 
         * @return builder
         * 
         */
        public Builder iosTestLoop(IosTestLoopArgs iosTestLoop) {
            return iosTestLoop(Output.of(iosTestLoop));
        }

        /**
         * @param iosXcTest An iOS XCTest.
         * 
         * @return builder
         * 
         */
        public Builder iosXcTest(@Nullable Output<IosXcTestArgs> iosXcTest) {
            $.iosXcTest = iosXcTest;
            return this;
        }

        /**
         * @param iosXcTest An iOS XCTest.
         * 
         * @return builder
         * 
         */
        public Builder iosXcTest(IosXcTestArgs iosXcTest) {
            return iosXcTest(Output.of(iosXcTest));
        }

        /**
         * @param testTimeout Max time a test is allowed to run before it is automatically cancelled.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(@Nullable Output<DurationArgs> testTimeout) {
            $.testTimeout = testTimeout;
            return this;
        }

        /**
         * @param testTimeout Max time a test is allowed to run before it is automatically cancelled.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(DurationArgs testTimeout) {
            return testTimeout(Output.of(testTimeout));
        }

        public IosTestArgs build() {
            return $;
        }
    }

}
