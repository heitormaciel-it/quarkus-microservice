package br.com.shopi.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "products")
public class Product extends PanacheEntity implements Serializable {
	private static final long serialVersionUID = -8656325560109155713L;
	
	@Column(name = "product_code")
	private Long productCode;
	
	@Column(name = "barcode")
	private Long barCode;
	
	@Column(name = "reference_code")
	private String referenceCode;
	
	@Column(name = "internal_code")
	private String internalCode;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "status")
	private Long status;
	
	@Column(name = "group_code")
	private Long groupCode;
	
	@Column(name = "color_code")
	private Long colorCode;
	
	@Column(name = "size_code")
	private Long sizeCode;
	
	@Column(name = "cost_value")
	private BigDecimal costValue;
	
	@Column(name = "sale_value")
	private BigDecimal saleValue;
	
	@Column(name = "quantity")
	private BigDecimal quantity;
	
	@Column(name = "quantity_sale")
	private BigDecimal quantitySale;
	
	@Column(name = "ncm")
	private Long ncm;
	
	@Column(name = "business_unit")
	private String businessUnit;
	
	@Column(name = "path_image")
	private String pathImage;
	
	public Product() {}

	public Product(Long productCode, Long barCode, String referenceCode, String internalCode, String productName, Long status,
			Long groupCode, Long colorCode, Long sizeCode, BigDecimal costValue, BigDecimal saleValue,
			BigDecimal quantity, BigDecimal quantitySale, Long ncm, String businessUnit, String pathImage) {
		super();
		this.productCode = productCode;
		this.barCode = barCode;
		this.referenceCode = referenceCode;
		this.internalCode = internalCode;
		this.productName = productName;
		this.status = status;
		this.groupCode = groupCode;
		this.colorCode = colorCode;
		this.sizeCode = sizeCode;
		this.costValue = costValue;
		this.saleValue = saleValue;
		this.quantity = quantity;
		this.quantitySale = quantitySale;
		this.ncm = ncm;
		this.businessUnit = businessUnit;
		this.pathImage = pathImage;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public Long getBarCode() {
		return barCode;
	}

	public void setBarCode(Long barCode) {
		this.barCode = barCode;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}

	public Long getColorCode() {
		return colorCode;
	}

	public void setColorCode(Long colorCode) {
		this.colorCode = colorCode;
	}

	public Long getSizeCode() {
		return sizeCode;
	}

	public void setSizeCode(Long sizeCode) {
		this.sizeCode = sizeCode;
	}

	public BigDecimal getCostValue() {
		return costValue;
	}

	public void setCostValue(BigDecimal costValue) {
		this.costValue = costValue;
	}

	public BigDecimal getSaleValue() {
		return saleValue;
	}

	public void setSaleValue(BigDecimal saleValue) {
		this.saleValue = saleValue;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getQuantitySale() {
		return quantitySale;
	}

	public void setQuantitySale(BigDecimal quantitySale) {
		this.quantitySale = quantitySale;
	}

	public Long getNcm() {
		return ncm;
	}

	public void setNcm(Long ncm) {
		this.ncm = ncm;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", barCode=" + barCode + ", referenceCode=" + referenceCode
				+ ", internalCode=" + internalCode + ", name=" + productName + ", status=" + status + ", groupCode="
				+ groupCode + ", colorCode=" + colorCode + ", sizeCode=" + sizeCode + ", costValue=" + costValue
				+ ", saleValue=" + saleValue + ", quantity=" + quantity + ", quantitySale=" + quantitySale + ", ncm="
				+ ncm + ", businessUnit=" + businessUnit + ", pathImage=" + pathImage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCode == null) ? 0 : barCode.hashCode());
		result = prime * result + ((businessUnit == null) ? 0 : businessUnit.hashCode());
		result = prime * result + ((colorCode == null) ? 0 : colorCode.hashCode());
		result = prime * result + ((costValue == null) ? 0 : costValue.hashCode());
		result = prime * result + ((groupCode == null) ? 0 : groupCode.hashCode());
		result = prime * result + ((internalCode == null) ? 0 : internalCode.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((ncm == null) ? 0 : ncm.hashCode());
		result = prime * result + ((pathImage == null) ? 0 : pathImage.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((quantitySale == null) ? 0 : quantitySale.hashCode());
		result = prime * result + ((referenceCode == null) ? 0 : referenceCode.hashCode());
		result = prime * result + ((saleValue == null) ? 0 : saleValue.hashCode());
		result = prime * result + ((sizeCode == null) ? 0 : sizeCode.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (barCode == null) {
			if (other.barCode != null)
				return false;
		} else if (!barCode.equals(other.barCode))
			return false;
		if (businessUnit == null) {
			if (other.businessUnit != null)
				return false;
		} else if (!businessUnit.equals(other.businessUnit))
			return false;
		if (colorCode == null) {
			if (other.colorCode != null)
				return false;
		} else if (!colorCode.equals(other.colorCode))
			return false;
		if (costValue == null) {
			if (other.costValue != null)
				return false;
		} else if (!costValue.equals(other.costValue))
			return false;
		if (groupCode == null) {
			if (other.groupCode != null)
				return false;
		} else if (!groupCode.equals(other.groupCode))
			return false;
		if (internalCode == null) {
			if (other.internalCode != null)
				return false;
		} else if (!internalCode.equals(other.internalCode))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (ncm == null) {
			if (other.ncm != null)
				return false;
		} else if (!ncm.equals(other.ncm))
			return false;
		if (pathImage == null) {
			if (other.pathImage != null)
				return false;
		} else if (!pathImage.equals(other.pathImage))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (quantitySale == null) {
			if (other.quantitySale != null)
				return false;
		} else if (!quantitySale.equals(other.quantitySale))
			return false;
		if (referenceCode == null) {
			if (other.referenceCode != null)
				return false;
		} else if (!referenceCode.equals(other.referenceCode))
			return false;
		if (saleValue == null) {
			if (other.saleValue != null)
				return false;
		} else if (!saleValue.equals(other.saleValue))
			return false;
		if (sizeCode == null) {
			if (other.sizeCode != null)
				return false;
		} else if (!sizeCode.equals(other.sizeCode))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}	
}
