// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPackageVersionArgs extends InvokeArgs {

    public static final GetPackageVersionArgs Empty = new GetPackageVersionArgs();

    @Import(name="packageId", required=true)
    private String packageId;

    public String packageId() {
        return this.packageId;
    }

    @Import(name="packageVersion", required=true)
    private String packageVersion;

    public String packageVersion() {
        return this.packageVersion;
    }

    @Import(name="patchVersion", required=true)
    private String patchVersion;

    public String patchVersion() {
        return this.patchVersion;
    }

    private GetPackageVersionArgs() {}

    private GetPackageVersionArgs(GetPackageVersionArgs $) {
        this.packageId = $.packageId;
        this.packageVersion = $.packageVersion;
        this.patchVersion = $.patchVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackageVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackageVersionArgs $;

        public Builder() {
            $ = new GetPackageVersionArgs();
        }

        public Builder(GetPackageVersionArgs defaults) {
            $ = new GetPackageVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder packageId(String packageId) {
            $.packageId = packageId;
            return this;
        }

        public Builder packageVersion(String packageVersion) {
            $.packageVersion = packageVersion;
            return this;
        }

        public Builder patchVersion(String patchVersion) {
            $.patchVersion = patchVersion;
            return this;
        }

        public GetPackageVersionArgs build() {
            $.packageId = Objects.requireNonNull($.packageId, "expected parameter 'packageId' to be non-null");
            $.packageVersion = Objects.requireNonNull($.packageVersion, "expected parameter 'packageVersion' to be non-null");
            $.patchVersion = Objects.requireNonNull($.patchVersion, "expected parameter 'patchVersion' to be non-null");
            return $;
        }
    }

}
