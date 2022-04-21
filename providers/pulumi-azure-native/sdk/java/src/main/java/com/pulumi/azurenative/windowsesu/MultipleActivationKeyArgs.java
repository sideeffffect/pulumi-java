// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.windowsesu;

import com.pulumi.azurenative.windowsesu.enums.OsType;
import com.pulumi.azurenative.windowsesu.enums.SupportType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MultipleActivationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultipleActivationKeyArgs Empty = new MultipleActivationKeyArgs();

    /**
     * Agreement number under which the key is requested.
     * 
     */
    @Import(name="agreementNumber")
    private @Nullable Output<String> agreementNumber;

    public Optional<Output<String>> agreementNumber() {
        return Optional.ofNullable(this.agreementNumber);
    }

    /**
     * Number of activations/servers using the MAK key.
     * 
     */
    @Import(name="installedServerNumber")
    private @Nullable Output<Integer> installedServerNumber;

    public Optional<Output<Integer>> installedServerNumber() {
        return Optional.ofNullable(this.installedServerNumber);
    }

    /**
     * &lt;code&gt; true &lt;/code&gt; if user has eligible on-premises Windows physical or virtual machines, and that the requested key will only be used in their organization; &lt;code&gt; false &lt;/code&gt; otherwise.
     * 
     */
    @Import(name="isEligible")
    private @Nullable Output<Boolean> isEligible;

    public Optional<Output<Boolean>> isEligible() {
        return Optional.ofNullable(this.isEligible);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the MAK key.
     * 
     */
    @Import(name="multipleActivationKeyName")
    private @Nullable Output<String> multipleActivationKeyName;

    public Optional<Output<String>> multipleActivationKeyName() {
        return Optional.ofNullable(this.multipleActivationKeyName);
    }

    /**
     * Type of OS for which the key is requested.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<Either<String,OsType>> osType;

    public Optional<Output<Either<String,OsType>>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Type of support
     * 
     */
    @Import(name="supportType")
    private @Nullable Output<Either<String,SupportType>> supportType;

    public Optional<Output<Either<String,SupportType>>> supportType() {
        return Optional.ofNullable(this.supportType);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private MultipleActivationKeyArgs() {}

    private MultipleActivationKeyArgs(MultipleActivationKeyArgs $) {
        this.agreementNumber = $.agreementNumber;
        this.installedServerNumber = $.installedServerNumber;
        this.isEligible = $.isEligible;
        this.location = $.location;
        this.multipleActivationKeyName = $.multipleActivationKeyName;
        this.osType = $.osType;
        this.resourceGroupName = $.resourceGroupName;
        this.supportType = $.supportType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultipleActivationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultipleActivationKeyArgs $;

        public Builder() {
            $ = new MultipleActivationKeyArgs();
        }

        public Builder(MultipleActivationKeyArgs defaults) {
            $ = new MultipleActivationKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder agreementNumber(@Nullable Output<String> agreementNumber) {
            $.agreementNumber = agreementNumber;
            return this;
        }

        public Builder agreementNumber(String agreementNumber) {
            return agreementNumber(Output.of(agreementNumber));
        }

        public Builder installedServerNumber(@Nullable Output<Integer> installedServerNumber) {
            $.installedServerNumber = installedServerNumber;
            return this;
        }

        public Builder installedServerNumber(Integer installedServerNumber) {
            return installedServerNumber(Output.of(installedServerNumber));
        }

        public Builder isEligible(@Nullable Output<Boolean> isEligible) {
            $.isEligible = isEligible;
            return this;
        }

        public Builder isEligible(Boolean isEligible) {
            return isEligible(Output.of(isEligible));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder multipleActivationKeyName(@Nullable Output<String> multipleActivationKeyName) {
            $.multipleActivationKeyName = multipleActivationKeyName;
            return this;
        }

        public Builder multipleActivationKeyName(String multipleActivationKeyName) {
            return multipleActivationKeyName(Output.of(multipleActivationKeyName));
        }

        public Builder osType(@Nullable Output<Either<String,OsType>> osType) {
            $.osType = osType;
            return this;
        }

        public Builder osType(Either<String,OsType> osType) {
            return osType(Output.of(osType));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder supportType(@Nullable Output<Either<String,SupportType>> supportType) {
            $.supportType = supportType;
            return this;
        }

        public Builder supportType(Either<String,SupportType> supportType) {
            return supportType(Output.of(supportType));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public MultipleActivationKeyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.supportType = Codegen.stringProp("supportType").left(SupportType.class).output().arg($.supportType).def("SupplementalServicing").getNullable();
            return $;
        }
    }

}
