// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Apt patching is completed by executing `apt-get update &amp;&amp; apt-get upgrade`. Additional options can be set to control how this is executed.
 * 
 */
public final class AptSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AptSettingsResponse Empty = new AptSettingsResponse();

    /**
     * List of packages to exclude from update. These packages will be excluded
     * 
     */
    @Import(name="excludes", required=true)
    private List<String> excludes;

    public List<String> excludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePackages", required=true)
    private List<String> exclusivePackages;

    public List<String> exclusivePackages() {
        return this.exclusivePackages;
    }

    /**
     * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private AptSettingsResponse() {}

    private AptSettingsResponse(AptSettingsResponse $) {
        this.excludes = $.excludes;
        this.exclusivePackages = $.exclusivePackages;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AptSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AptSettingsResponse $;

        public Builder() {
            $ = new AptSettingsResponse();
        }

        public Builder(AptSettingsResponse defaults) {
            $ = new AptSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder excludes(List<String> excludes) {
            $.excludes = excludes;
            return this;
        }

        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        public Builder exclusivePackages(List<String> exclusivePackages) {
            $.exclusivePackages = exclusivePackages;
            return this;
        }

        public Builder exclusivePackages(String... exclusivePackages) {
            return exclusivePackages(List.of(exclusivePackages));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AptSettingsResponse build() {
            $.excludes = Objects.requireNonNull($.excludes, "expected parameter 'excludes' to be non-null");
            $.exclusivePackages = Objects.requireNonNull($.exclusivePackages, "expected parameter 'exclusivePackages' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
