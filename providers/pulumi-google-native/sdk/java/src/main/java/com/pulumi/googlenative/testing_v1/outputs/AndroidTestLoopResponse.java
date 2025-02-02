// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.AppBundleResponse;
import com.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidTestLoopResponse {
    /**
     * @return The APK for the application under test.
     * 
     */
    private final FileReferenceResponse appApk;
    /**
     * @return A multi-apk app bundle for the application under test.
     * 
     */
    private final AppBundleResponse appBundle;
    /**
     * @return The java package for the application under test. The default is determined by examining the application&#39;s manifest.
     * 
     */
    private final String appPackageId;
    /**
     * @return The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application&#39;s manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
     */
    private final List<String> scenarioLabels;
    /**
     * @return The list of scenarios that should be run during the test. The default is all test loops, derived from the application&#39;s manifest.
     * 
     */
    private final List<Integer> scenarios;

    @CustomType.Constructor
    private AndroidTestLoopResponse(
        @CustomType.Parameter("appApk") FileReferenceResponse appApk,
        @CustomType.Parameter("appBundle") AppBundleResponse appBundle,
        @CustomType.Parameter("appPackageId") String appPackageId,
        @CustomType.Parameter("scenarioLabels") List<String> scenarioLabels,
        @CustomType.Parameter("scenarios") List<Integer> scenarios) {
        this.appApk = appApk;
        this.appBundle = appBundle;
        this.appPackageId = appPackageId;
        this.scenarioLabels = scenarioLabels;
        this.scenarios = scenarios;
    }

    /**
     * @return The APK for the application under test.
     * 
     */
    public FileReferenceResponse appApk() {
        return this.appApk;
    }
    /**
     * @return A multi-apk app bundle for the application under test.
     * 
     */
    public AppBundleResponse appBundle() {
        return this.appBundle;
    }
    /**
     * @return The java package for the application under test. The default is determined by examining the application&#39;s manifest.
     * 
     */
    public String appPackageId() {
        return this.appPackageId;
    }
    /**
     * @return The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application&#39;s manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
     */
    public List<String> scenarioLabels() {
        return this.scenarioLabels;
    }
    /**
     * @return The list of scenarios that should be run during the test. The default is all test loops, derived from the application&#39;s manifest.
     * 
     */
    public List<Integer> scenarios() {
        return this.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appPackageId;
        private List<String> scenarioLabels;
        private List<Integer> scenarios;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appPackageId = defaults.appPackageId;
    	      this.scenarioLabels = defaults.scenarioLabels;
    	      this.scenarios = defaults.scenarios;
        }

        public Builder appApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }
        public Builder appBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }
        public Builder appPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }
        public Builder scenarioLabels(List<String> scenarioLabels) {
            this.scenarioLabels = Objects.requireNonNull(scenarioLabels);
            return this;
        }
        public Builder scenarioLabels(String... scenarioLabels) {
            return scenarioLabels(List.of(scenarioLabels));
        }
        public Builder scenarios(List<Integer> scenarios) {
            this.scenarios = Objects.requireNonNull(scenarios);
            return this;
        }
        public Builder scenarios(Integer... scenarios) {
            return scenarios(List.of(scenarios));
        }        public AndroidTestLoopResponse build() {
            return new AndroidTestLoopResponse(appApk, appBundle, appPackageId, scenarioLabels, scenarios);
        }
    }
}
