// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Android app information.
 * 
 */
public final class AndroidAppInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidAppInfoArgs Empty = new AndroidAppInfoArgs();

    /**
     * The name of the app. Optional
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The package name of the app. Required.
     * 
     */
    @Import(name="packageName")
    private @Nullable Output<String> packageName;

    public Optional<Output<String>> packageName() {
        return Optional.ofNullable(this.packageName);
    }

    /**
     * The internal version code of the app. Optional.
     * 
     */
    @Import(name="versionCode")
    private @Nullable Output<String> versionCode;

    public Optional<Output<String>> versionCode() {
        return Optional.ofNullable(this.versionCode);
    }

    /**
     * The version name of the app. Optional.
     * 
     */
    @Import(name="versionName")
    private @Nullable Output<String> versionName;

    public Optional<Output<String>> versionName() {
        return Optional.ofNullable(this.versionName);
    }

    private AndroidAppInfoArgs() {}

    private AndroidAppInfoArgs(AndroidAppInfoArgs $) {
        this.name = $.name;
        this.packageName = $.packageName;
        this.versionCode = $.versionCode;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidAppInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidAppInfoArgs $;

        public Builder() {
            $ = new AndroidAppInfoArgs();
        }

        public Builder(AndroidAppInfoArgs defaults) {
            $ = new AndroidAppInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder packageName(@Nullable Output<String> packageName) {
            $.packageName = packageName;
            return this;
        }

        public Builder packageName(String packageName) {
            return packageName(Output.of(packageName));
        }

        public Builder versionCode(@Nullable Output<String> versionCode) {
            $.versionCode = versionCode;
            return this;
        }

        public Builder versionCode(String versionCode) {
            return versionCode(Output.of(versionCode));
        }

        public Builder versionName(@Nullable Output<String> versionName) {
            $.versionName = versionName;
            return this;
        }

        public Builder versionName(String versionName) {
            return versionName(Output.of(versionName));
        }

        public AndroidAppInfoArgs build() {
            return $;
        }
    }

}
