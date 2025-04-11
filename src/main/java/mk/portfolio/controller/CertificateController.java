package mk.portfolio.controller;

import mk.portfolio.model.Certificate;
import mk.portfolio.service.CertificateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "https://mike-vega.dev/")
public class CertificateController {
  private static final Logger logger = LoggerFactory.getLogger(CertificateController.class);

  @Autowired
  private CertificateService certificateService;

  @GetMapping("/certificates")
  public List<Certificate> getCertificates(){
    var certificates = certificateService.showCertificates();
    certificates.forEach((certificate -> logger.info(certificate.toString())));
    return certificates;
  }
}
