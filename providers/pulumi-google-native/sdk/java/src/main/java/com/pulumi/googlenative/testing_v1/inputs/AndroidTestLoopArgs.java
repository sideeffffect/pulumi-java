// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AppBundleArgs;
import com.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A test of an Android Application with a Test Loop. The intent \ will be implicitly added, since Games is the only user of this api, for the time being.
 * 
 */
public final class AndroidTestLoopArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidTestLoopArgs Empty = new AndroidTestLoopArgs();

    /**
     * The APK for the application under test.
     * 
     */
    @Import(name="appApk")
    private @Nullable Output<FileReferenceArgs> appApk;

    public Optional<Output<FileReferenceArgs>> appApk() {
        return Optional.ofNullable(this.appApk);
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @Import(name="appBundle")
    private @Nullable Output<AppBundleArgs> appBundle;

    public Optional<Output<AppBundleArgs>> appBundle() {
        return Optional.ofNullable(this.appBundle);
    }

    /**
     * The java package for the application under test. The default is determined by examining the application&#39;s manifest.
     * 
     */
    @Import(name="appPackageId")
    private @Nullable Output<String> appPackageId;

    public Optional<Output<String>> appPackageId() {
        return Optional.ofNullable(this.appPackageId);
    }

    /**
     * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application&#39;s manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
     */
    @Import(name="scenarioLabels")
    private @Nullable Output<List<String>> scenarioLabels;

    public Optional<Output<List<String>>> scenarioLabels() {
        return Optional.ofNullable(this.scenarioLabels);
    }

    /**
     * The list of scenarios that should be run during the test. The default is all test loops, derived from the application&#39;s manifest.
     * 
     */
    @Import(name="scenarios")
    private @Nullable Output<List<Integer>> scenarios;

    public Optional<Output<List<Integer>>> scenarios() {
        return Optional.ofNullable(this.scenarios);
    }

    private AndroidTestLoopArgs() {}

    private AndroidTestLoopArgs(AndroidTestLoopArgs $) {
        this.appApk = $.appApk;
        this.appBundle = $.appBundle;
        this.appPackageId = $.appPackageId;
        this.scenarioLabels = $.scenarioLabels;
        this.scenarios = $.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidTestLoopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidTestLoopArgs $;

        public Builder() {
            $ = new AndroidTestLoopArgs();
        }

        public Builder(AndroidTestLoopArgs defaults) {
            $ = new AndroidTestLoopArgs(Objects.requireNonNull(defaults));
        }

        public Builder appApk(@Nullable Output<FileReferenceArgs> appApk) {
            $.appApk = appApk;
            return this;
        }

        public Builder appApk(FileReferenceArgs appApk) {
            return appApk(Output.of(appApk));
        }

        public Builder appBundle(@Nullable Output<AppBundleArgs> appBundle) {
            $.appBundle = appBundle;
            return this;
        }

        public Builder appBundle(AppBundleArgs appBundle) {
            return appBundle(Output.of(appBundle));
        }

        public Builder appPackageId(@Nullable Output<String> appPackageId) {
            $.appPackageId = appPackageId;
            return this;
        }

        public Builder appPackageId(String appPackageId) {
            return appPackageId(Output.of(appPackageId));
        }

        public Builder scenarioLabels(@Nullable Output<List<String>> scenarioLabels) {
            $.scenarioLabels = scenarioLabels;
            return this;
        }

        public Builder scenarioLabels(List<String> scenarioLabels) {
            return scenarioLabels(Output.of(scenarioLabels));
        }

        public Builder scenarioLabels(String... scenarioLabels) {
            return scenarioLabels(List.of(scenarioLabels));
        }

        public Builder scenarios(@Nullable Output<List<Integer>> scenarios) {
            $.scenarios = scenarios;
            return this;
        }

        public Builder scenarios(List<Integer> scenarios) {
            return scenarios(Output.of(scenarios));
        }

        public Builder scenarios(Integer... scenarios) {
            return scenarios(List.of(scenarios));
        }

        public AndroidTestLoopArgs build() {
            return $;
        }
    }

}
